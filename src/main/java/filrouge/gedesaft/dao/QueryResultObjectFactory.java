package filrouge.gedesaft.dao;

// Classe d'instanciation d'une classe de type QueryResult... en fonction du type d'objet
public class QueryResultObjectFactory {

	
	/**
	 * @param objectType
	 * @return
	 */
	public IQueryResultObject getQueryResultObject (String objectType) {
		
		switch (objectType) {
			case "vehicule" : return new QueryResultVehicule();
			default: return null;
		}
		
	}

}
