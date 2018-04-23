package filrouge.gedesaft.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import filrouge.gedesaft.model.Vehicule;

public class BuildInsertVehiculeRequest implements IBuildInsertObjectRequest{
	
	// Requête pour la création d'un nouveau véhicule dans la table vehicule
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IBuildInsertObjectRequest#getRequest()
	 */
	@Override
	public String getRequest() {
		System.out.println("BuildInsertVehiculeRequest getRequest");
		String request = "INSERT INTO vehicule (id, type, marque, modele, immatriculation, couleur, idPersonne) VALUES (?,?,?,?,?,?,?)";
		return request;
	}
	
	// Coonstruction du PrepareStatement avec l'instance de Vehicule donnée en paramètre
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IBuildInsertObjectRequest#buildRequest(java.sql.PreparedStatement, java.lang.Object)
	 */
	@Override
	public void buildRequest(PreparedStatement pstmt, Object vehicule) throws Exception {
		System.out.println("BuildInsertVehiculeRequest buildRequest");
		int i = 0;
		((Vehicule) vehicule).setId(new Long(0));
		pstmt.setLong(++i, ((Vehicule) vehicule).getId());
		pstmt.setString(++i, ((Vehicule) vehicule).getType());
		pstmt.setString(++i, ((Vehicule) vehicule).getMarque());
		pstmt.setString(++i, ((Vehicule) vehicule).getModele());
		pstmt.setString(++i, ((Vehicule) vehicule).getImmatriculation());
		pstmt.setString(++i, ((Vehicule) vehicule).getCouleur());
		pstmt.setLong(++i, ((Vehicule) vehicule).getProprietaire().getIdPersonne());
	}
	
	// setter de la l'id_vehicule généré lors de l'insertion d'un nouveau vehicule dans la table vehicule
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IBuildInsertObjectRequest#setGeneratedKey(java.sql.ResultSet, java.lang.Object)
	 */
	@Override
	public void setGeneratedKey(ResultSet rs, Object vehicule) throws SQLException {
		if (rs.next()) {
			((Vehicule) vehicule).setId(rs.getLong(1));
		}
	}

}
