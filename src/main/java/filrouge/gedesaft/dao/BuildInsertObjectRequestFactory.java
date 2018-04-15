package filrouge.gedesaft.dao;

public class BuildInsertObjectRequestFactory {

	// Instancie une classe de construction d'un requête d'insertion d'objet en fonction du type d'objet (table de la base de données)
	/**
	 * @param objectType
	 * @return
	 */
	public IBuildInsertObjectRequest getBuildStatement (String objectType) {
		
		System.out.println("BuildInsertObjectRequestFactory getBuildStatement");
		
		switch (objectType) {
			case "vehicule" : return new BuildInsertVehiculeRequest();
			default: return null;
		}
		
	}
}
