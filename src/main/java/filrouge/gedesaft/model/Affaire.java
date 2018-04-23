package filrouge.gedesaft.model;

import java.sql.Date;
import java.util.List;

public class Affaire {
	
	private Long id_affaire;
	private Date dateOuverture;
	private String nom;
	private String lieu;
	private List<VehiculeImplique> listVehiculeImplique;
	private List<ArmeImpliquee> listArmeImpliquee;
	private List<Suspect> listSuspect;
	private List<Agent> listAgentAffecte;
	private List<Victime> listVictime;
	private List<Temoin> listTemoin;
	
	public Affaire() {
		super();
	}

	public Long getId_affaire() {
		return id_affaire;
	}

	public void setId_affaire(Long id_affaire) {
		this.id_affaire = id_affaire;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public List<VehiculeImplique> getListVehiculeImplique() {
		return listVehiculeImplique;
	}

	public void setListVehiculeImplique(List<VehiculeImplique> listVehiculeImplique) {
		this.listVehiculeImplique = listVehiculeImplique;
	}

	public List<ArmeImpliquee> getListArmeImpliquee() {
		return listArmeImpliquee;
	}

	public void setListArmeImpliquee(List<ArmeImpliquee> listArmeImpliquee) {
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

	public List<Victime> getListVictime() {
		return listVictime;
	}

	public void setListVictime(List<Victime> listVictime) {
		this.listVictime = listVictime;
	}

	public List<Temoin> getListTemoin() {
		return listTemoin;
	}

	public void setListTemoin(List<Temoin> listTemoin) {
		this.listTemoin = listTemoin;
	}
	
}
