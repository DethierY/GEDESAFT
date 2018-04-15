package filrouge.gedesaft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import filrouge.gedesaft.model.Representation;

//Classe de gestion de la connection avec la base de données
@Repository
public class DataDaoImpl implements IDataDao {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private DataSource datasource;

	// Auto instanciation de la classe au démarrage de l'application
	@Autowired
	public DataDaoImpl(JdbcTemplate jdbcTemplate) {
		this.datasource = jdbcTemplate.getDataSource();
	}

	// Création d'une Representaiton (id, champ) d'un objet d'une table
	// en fonction d'un id, d'un champ et de la requête SQL de recherche
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IDataDao#getRepresentationData(java.lang.Long, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Representation getRepresentationData(
			Long searchId, String idField, String fieldObject, String request)
			throws Exception {
		Representation representation = new Representation();
		QueryResultRepresentation representationResult = new QueryResultRepresentation ();
		PreparedStatement pstmt = null;
		ResultSet rs;
		try {
			pstmt = datasource.getConnection().prepareStatement(request);
			pstmt.setLong(1, searchId);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				representation = representationResult.queryResult(rs, idField, fieldObject);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return representation;
	}

	// Création d'une liste de Representaiton (id, champ) d'objets d'une table
	// en fonction d'un id, d'un champ et de la requête SQL de recherche
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IDataDao#getListRepresentationData(java.lang.Long, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Representation> getListRepresentationData(
			Long searchId, String idField, String fieldObject, String request)
			throws Exception {
		Representation representation;
		QueryResultRepresentation representationResult = new QueryResultRepresentation ();
		PreparedStatement pstmt = null;
		ResultSet rs;
		List<Representation> representationList = new ArrayList<Representation>();
		try {
			pstmt = datasource.getConnection().prepareStatement(request);
			pstmt.setLong(1, searchId);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				representation = representationResult.queryResult(rs, idField, fieldObject);				
				representationList.add(representation);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return representationList;
	}

	// Création d'un Object en fonction de son type, de son id et de la requête SQL de recherche
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IDataDao#getObjectData(java.lang.String, java.lang.Long, java.lang.String)
	 */
	@Override
	public Object getObjectData(String typeObject, Long idObject, String request) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs;
		QueryResultObjectFactory queryFactory = new QueryResultObjectFactory();
		Object objectResult = null;
		try {
			pstmt = datasource.getConnection().prepareStatement(request);
			pstmt.setLong(1, idObject);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			if (rs.next())
				objectResult = queryFactory.getQueryResultObject(typeObject).queryResult(rs);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return objectResult;
	}
	
	// Ajout d'un objet (Object) dans une table de la base de données en fonction de la table (typeObject) 
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IDataDao#insertObjectData(java.lang.String, java.lang.Object)
	 */
	@Override
	public void insertObjectData(String typeObject, Object object) throws Exception {
		System.out.println("DataDaoImpl insertObjectData");
		PreparedStatement pstmt = null;
		BuildInsertObjectRequestFactory bsf = new BuildInsertObjectRequestFactory();
		IBuildInsertObjectRequest bsco = bsf.getBuildStatement(typeObject);
		try {
			String sql = bsco.getRequest();
			pstmt = datasource.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			bsco.buildRequest(pstmt, object);
			logSQL(pstmt);
			pstmt.executeUpdate();
			System.out.println("DataDaoImpl executeUpdate");
			ResultSet rs = pstmt.getGeneratedKeys();
			System.out.println(rs);
			bsco.setGeneratedKey(rs, object);
			System.out.println("setGeneratedKey ok");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
	}
	
	// La requête effectuée est inscrite dans le log
	/**
	 * @param pstmt
	 */
	private void logSQL(PreparedStatement pstmt) {
		String sql;
		if (pstmt == null)
			return;
		sql = pstmt.toString().substring(pstmt.toString().indexOf(":") + 2);
		log.debug(sql);
	}
	

	// bean de construction d'instance de la classe DaoVehicule
	/**
	 * @param jdbcTemplate
	 * @param datasource
	 * @return
	 */
	@Bean
	public DaoVehicule createVehiculeDao(JdbcTemplate jdbcTemplate, DataSource datasource) {
		return new DaoVehicule(jdbcTemplate, datasource);
	}
	
}
