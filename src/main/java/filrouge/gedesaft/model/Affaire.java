package filrouge.gedesaft.model;

import java.sql.Date;
import java.util.List;

public class Affaire {
	
	private Long id_affaire;
	private String dossier;
	private String lieu;
	private List<Vehicule> listVehiculeImplique;
	private List<Arme> listArmeImpliquee;
	private List<Suspect> listSuspect;
	private List<Agent> listAgentAffecte;
	
	public Affaire() {
		super();
	}

	public Long getId_affaire() {
		return id_affaire;
	}

	public void setId_affaire(Long id_affaire) {
		this.id_affaire = id_affaire;
	}

	public String getDossier() {
		return dossier;
	}

	public void setDossier(String dossier) {
		this.dossier = dossier;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public List<Vehicule> getListVehiculeImplique() {
		return listVehiculeImplique;
	}

	public void setListVehiculeImplique(List<Vehicule> listVehiculeImplique) {
		this.listVehiculeImplique = listVehiculeImplique;
	}

	public List<Arme> getListArmeImpliquee() {
		return listArmeImpliquee;
	}

	public void setListArmeImpliquee(List<Arme> listArmeImpliquee) {
		this.listArmeImpliquee = listArmeImpliquee;
	}

	public List<Suspect> getListSuspect() {
		return listSuspect;
	}

	public void setListSuspect(List<Suspect> listSuspect) {
		this.listSuspect = listSuspect;
	}

	public List<Agent> getListAgentAffecte() {
		return listAgentAffecte;
	}

	public void setListAgentAffecte(List<Agent> listAgentAffecte) {
		this.listAgentAffecte = listAgentAffecte;
	}
	
}
