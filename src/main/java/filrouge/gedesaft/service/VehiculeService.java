package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.DaoVehicule;
import filrouge.gedesaft.model.Representation;
import filrouge.gedesaft.model.Vehicule;

//clase de service
@Service
public class VehiculeService {

	// Injection d'une instance de la classe DaoVehicule
	@Autowired
	private DaoVehicule dao;

	
	/**
	 * @param id_utilisateur
	 * @return
	 * @throws Exception
	 */
	public List<Representation> getListRepresentationVehiculeParDefaut(Long id_utilisateur) throws Exception {
		return dao.getListRepresentationVehiculeParDefaut(id_utilisateur);
	}
	
	/**
	 * @param id_vehicule
	 * @return
	 * @throws Exception
	 */
	public Vehicule getVehiculeDetail(Long id_vehicule) throws Exception {
		return dao.getVehicule(id_vehicule);
	}
	
	/**
	 * @param id_vehicule
	 * @return
	 * @throws Exception
	 */
	public List<Representation> getRepresentationAffairesImpliquantVehicule(Long id_vehicule) throws Exception {
		return dao.getListRepresentationAffairesImpliquantVehicule(id_vehicule);
	}
	
	/**
	 * @param id_vehicule
	 * @return
	 * @throws Exception
	 */
	public Representation getRepresentationProprietaireVehicule(Long id_vehicule) throws Exception {
		return dao.getRepresentationProprietaireVehicule(id_vehicule);
	}

	/**
	 * @param vehicule
	 * @throws Exception
	 */
	public void addVehicule(Vehicule vehicule) throws Exception {
		dao.insertObjectData("vehicule", vehicule);
	}
	
}
