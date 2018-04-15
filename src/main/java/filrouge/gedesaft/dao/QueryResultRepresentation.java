package filrouge.gedesaft.dao;

import java.sql.ResultSet;

import filrouge.gedesaft.model.Representation;

// Classe permettant de création une Representation (id, champ)
public class QueryResultRepresentation {
	
	// Instanciation d'un Objet Representation en fonction du ResultSet de la requête,
	// du d'id de l'objet recherché et du champ de la table que l'on veut récupérer dans l'objet Representation
	/**
	 * @param rs
	 * @param idField
	 * @param fieldObject
	 * @return
	 * @throws Exception
	 */
	public Representation queryResult (ResultSet rs, String idField, String fieldName) throws Exception {
		Representation representation = new Representation();
		representation.setIdField(rs.getLong(idField));
		representation.setFieldName(rs.getString(fieldName));
		return representation;
}

}
