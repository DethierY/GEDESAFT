package filrouge.gedesaft.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		Pattern p = Pattern.compile("^[A-Z]{1,3}-[0-9]{1,3}-[A-Z]{1,3}$");
		
		return dao.insertVehicule(vehicule);
	}
	
	public Vehicule updateVehicule(Long id, Vehicule vehicule) throws Exception {
		if (verifierImmatriculation(vehicule.getImmatriculation())) {
			return dao.updateVehicule(vehicule);
		};
		return null;
	}
	
	public void deleteVehicule(Long id) throws Exception {
		dao.deleteVehicule(id);
	}
	
	public List<Affaire> getAllAffairesOfVehicule (Long id) throws Exception {
		return dao.getAffairesOfVehicule(id);
	}
	
	private boolean verifierImmatriculation(String immatriculation) {
		Pattern p = Pattern.compile("^[A-Z]{1,3}-[0-9]{1,3}-[A-Z]{1,3}$");
		Matcher m = p.matcher(immatriculation);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
		
	}
}
