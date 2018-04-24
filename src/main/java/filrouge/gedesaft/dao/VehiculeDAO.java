package filrouge.gedesaft.dao;

import java.util.List;

import filrouge.gedesaft.model.Vehicule;

public interface VehiculeDAO {
	
	public List<Vehicule> getListVehicules() throws Exception;

	public Vehicule getVehicule(Long id) throws Exception;
//
//	public Vehicule insertVehicule(Vehicule actor) throws Exception;
//
//	public Vehicule updateVehicule(Vehicule actor) throws Exception;
//	
//	public void deleteVehicule(Long id) throws Exception;

}
