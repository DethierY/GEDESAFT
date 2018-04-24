package filrouge.gedesaft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import filrouge.gedesaft.model.Personne;
import filrouge.gedesaft.model.Vehicule;

@Repository
public class JdbcVehiculeDAO implements VehiculeDAO {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private DataSource datasource;

	@Autowired
	public JdbcVehiculeDAO(JdbcTemplate jdbcTemplate) {
		this.datasource = jdbcTemplate.getDataSource();
	}

	@Override
	public List<Vehicule> getListVehicules() throws Exception {
		Vehicule vehicule;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql;
		ArrayList<Vehicule> aLlistOfVehicule = new ArrayList<Vehicule>();
		try {
			sql = "SELECT * FROM vehicules ";
			pstmt = datasource.getConnection().prepareStatement(sql);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vehicule = getVehiculeFromResultSet(rs);
				aLlistOfVehicule.add(vehicule);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return aLlistOfVehicule;
	}

	@Override
	public Vehicule getVehicule (Long id) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs;
		Vehicule vehicule = null;
		try {
			String sql = "SELECT * FROM vehicules WHERE id= ?";
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			if (rs.next())
				vehicule = getVehiculeFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return vehicule;
	}
	
	private Personne getPersonne (Long id) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs;
		Personne personne = null;
		try {
			String sql = "SELECT * FROM personnes WHERE idPersonne= ?";
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			logSQL(pstmt);
			rs = pstmt.executeQuery();
			if (rs.next())
				personne = getPersonneFromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return personne;
	}

	@Override
	public Vehicule insertVehicule(Vehicule vehicule) throws Exception {
		PreparedStatement pstmt = null;
		Vehicule result = null;
		int i = 0;
		vehicule.setId(new Long(0));
		try {
			String sql = "INSERT INTO vehicules (id, type, marque, modele, immatriculation, couleur) VALUES (?,?,?,?,?,?)";
			pstmt = datasource.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setLong(++i, vehicule.getId());
			pstmt.setString(++i, vehicule.getType());
			pstmt.setString(++i, vehicule.getMarque());
			pstmt.setString(++i, vehicule.getModele());
			pstmt.setString(++i, vehicule.getImmatriculation());
			pstmt.setString(++i, vehicule.getCouleur());		
			logSQL(pstmt);
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				vehicule.setId(rs.getLong(1));		
				result = vehicule;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
		return result;
	}
//
//
//	@Override
//	public Actor updateActor(Actor actor) throws Exception {
//		Actor result = null;
//		PreparedStatement pstmt = null;
//		int i = 0;
//		Timestamp updateTime = new Timestamp(System.currentTimeMillis());				
//		try {
//			String sql = "UPDATE actor SET first_name = ?, last_name = ?, last_update = ? WHERE actor_id = ?";
//			pstmt = datasource.getConnection().prepareStatement(sql);
//			pstmt.setString(++i, actor.getFirstName());
//			pstmt.setString(++i, actor.getLastName());
//			pstmt.setTimestamp(++i, updateTime);
//			pstmt.setLong(++i, actor.getId());			
//			logSQL(pstmt);
//			int resultCount = pstmt.executeUpdate();
//			if(resultCount != 1)
//				throw new Exception("Actor not found !");		
//			actor.setLastUpdate(updateTime);
//			result = actor;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			log.error("SQL Error !:" + pstmt.toString(), e);
//			throw e;
//		} finally {
//			pstmt.close();
//		}
//		return result;
//	}
//
//
	@Override
	public void deleteVehicule(Long id) throws Exception {
		PreparedStatement pstmt = null;
		
		try {
			String sql = "DELETE FROM vehicules WHERE id = ?";
			pstmt = datasource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			logSQL(pstmt);		
			int result = pstmt.executeUpdate();
			if(result != 1)
				throw new Exception("Vehicule not found !");		
			System.out.println("Result : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}
	}

	private Vehicule getVehiculeFromResultSet(ResultSet rs) throws Exception {
		Vehicule vehicule = new Vehicule();
		vehicule.setId(rs.getLong("id"));
		vehicule.setType(rs.getString("type"));
		vehicule.setMarque(rs.getString("marque"));
		vehicule.setModele(rs.getString("modele"));
		vehicule.setCouleur(rs.getString("couleur"));
		vehicule.setImmatriculation(rs.getString("immatriculation"));
		vehicule.setProprietaire(getPersonne(rs.getLong("personnes_idPersonne")));		
		return vehicule;
	}
	
	private Personne getPersonneFromResultSet(ResultSet rs) throws SQLException {
		Personne personne = new Personne();
		personne.setIdPersonne(rs.getLong("idPersonne"));
		personne.setNom(rs.getString("nom"));
		personne.setPrenom(rs.getString("prenom"));
		personne.setDateNaissance(rs.getDate("DateNaissance"));
		return personne;
	}

	private void logSQL(PreparedStatement pstmt) {
		String sql;		
		if (pstmt == null)
			return;		
		sql = pstmt.toString().substring(pstmt.toString().indexOf(":") + 2);
		log.debug(sql);
	}

}
