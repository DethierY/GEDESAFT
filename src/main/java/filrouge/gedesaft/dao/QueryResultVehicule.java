package filrouge.gedesaft.dao;

import java.sql.ResultSet;

import filrouge.gedesaft.model.Vehicule;

public class QueryResultVehicule implements IQueryResultObject {
	
	// Instanciation d'un objet de type Vehicule en fonction du ResulSet
	/* (non-Javadoc)
	 * @see filrouge.gedesaft.dao.IQueryResultObject#queryResult(java.sql.ResultSet)
	 */
	public Vehicule queryResult(ResultSet rs) throws Exception {
		Vehicule vehicule = new Vehicule ();
		vehicule.setId(rs.getLong("id_vehicule"));
		vehicule.setType(rs.getString("type"));
		vehicule.setMarque(rs.getString("marque"));
		vehicule.setModele(rs.getString("modele"));
		vehicule.setCouleur(rs.getString("couleur"));
		vehicule.setImmatriculation(rs.getString("immatriculation"));
		return vehicule;
	}

}
