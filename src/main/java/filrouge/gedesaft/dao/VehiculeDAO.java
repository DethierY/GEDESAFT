package filrouge.gedesaft.dao;

import java.util.List;

import filrouge.gedesaft.model.Affaire;
import filrouge.gedesaft.model.Vehicule;

public interface VehiculeDAO {
	
	public List<Vehicule> getListVehicules() throws Exception;

	public Vehicule getVehicule(Long id) throws Exception;

	public Vehicule insertVehicule(Vehicule vehicule) throws Exception;

	public Vehicule updateVehicule(Vehicule vehicule) throws Exception;
	
	public void deleteVehicule(Long id) throws Exception;
	
	public List<Affaire> getAffairesOfVehicule(Long id) throws Exception;

}