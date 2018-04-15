package filrouge.gedesaft.dao;

import java.sql.ResultSet;

// Interface pour les classes permettant d'instancier un objet à partir d'un ResultSet
public interface IQueryResultObject {

	// Signature de la méthode de construction d'un object en fonction du ResulSet
	/**
	 * @param rs
	 * @param id_object
	 * @return
	 * @throws Exception
	 */
	public Object queryResult(ResultSet rs) throws Exception;
}
