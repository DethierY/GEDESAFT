package filrouge.gedesaft.model;

import java.util.Date;

public class VehiculeImplique {
	
	private Long id_vehicule;
	private Date date_implication;
	private Vehicule vehicule;
	
	public Long getId_vehicule() {
		return id_vehicule;
	}
	
	public void setId_vehicule(Long id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	
	public Date getDate_implication() {
		return date_implication;
	}
	
	public void setDate_implication(Date date_implication) {
		this.date_implication = date_implication;
	}
	
	public Vehicule getVehicule() {
		return vehicule;
	}
	
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
}
