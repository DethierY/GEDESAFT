package filrouge.gedesaft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filrouge.gedesaft.dao.VehiculeDAO;
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
	
	
	
}
