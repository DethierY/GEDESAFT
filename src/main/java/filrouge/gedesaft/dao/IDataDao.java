package filrouge.gedesaft.dao;

import java.util.List;

import filrouge.gedesaft.model.Representation;

// Interface des classes gérant les connections avec la base de données
public interface IDataDao {

	// Signature des méthodes pour obtenir une Representation d'un objet
	/**
	 * @param idRecherche
	 * @param idObjectRepresente
	 * @param nomObjectRepresente
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public Representation getRepresentationData (
			Long idRecherche, 
			String idObjectRepresente, 
			String nomObjectRepresente, 
			String request
			) throws Exception;
	
	// Signature des méthodes pour obtenir une liste de Representation d'un objet
	/**
	 * @param idRecherche
	 * @param idObjectRepresentation
	 * @param nameObjectRepresentation
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public List<Representation> getListRepresentationData (
			Long idRecherche, 
			String idObjectRepresentation, 
			String nameObjectRepresentation, 
			String request
			) throws Exception;

	// Signature des méthodes permettant d'obvtenir les données d'un objet
	/**
	 * @param objectType
	 * @param id
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public Object getObjectData (String objectType, Long id, String request) throws Exception;
	
	// Signature pour les méthodes permettant d'ajouter un nouvel objet dans une table
	/**
	 * @param objectType
	 * @param object
	 * @throws Exception
	 */
	public void insertObjectData (String objectType, Object object) throws Exception;

}
