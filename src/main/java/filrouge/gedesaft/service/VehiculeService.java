package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.VehiculeDAO;
import filrouge.gedesaft.model.Affaire;
import filrouge.gedesaft.model.Vehicule;

@Service
public class VehiculeService {

	@Autowired
	private VehiculeDAO dao;
	
	public Vehicule getVehiculeDetail(Long id) throws Exception {
		return dao.getVehicule(id);
	}
	
	public List<Vehicule> getAllVehicules() throws Exception {
		return dao.getListVehicules();
	}
	
	public Vehicule addVehicule(Vehicule vehicule) throws Exception {
		return dao.insertVehicule(vehicule);
	}
	
	public Vehicule updateActor(Long id, Vehicule vehicule) throws Exception {
		return dao.updateVehicule(vehicule);
	}
	
	public void deleteVehicule(Long id) throws Exception {
		dao.deleteVehicule(id);
	}
	
	public List<Affaire> getAllAffairesOfVehicule (Long id) throws Exception {
		return dao.getAffairesOfVehicule(id);
	}
}
