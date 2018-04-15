package filrouge.gedesaft.model;

import java.sql.Date;
import java.util.List;

public class Affaire {
	
	private Long id_affaire;
	private String dossier;
	private Date date_cration;
	private Date date_cloture;
	private String lieu;
	private String rapport;
	private List<VehiculeImplique> listVehiculeImplique;
	private List<ArmeImpliquee> listArmeImpliquee;
	private List<Suspect> listSuspect;
	private	List<Temoin> listTemoin;
	private List<Victime> listVictime;
	private List<AgentAffecte> listAgentAffecte;
	
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

	public Date getDate_cration() {
		return date_cration;
	}

	public void setDate_cration(Date date_cration) {
		this.date_cration = date_cration;
	}

	public Date getDate_cloture() {
		return date_cloture;
	}

	public void setDate_cloture(Date date_cloture) {
		this.date_cloture = date_cloture;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getRapport() {
		return rapport;
	}

	public void setRapport(String rapport) {
		this.rapport = rapport;
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

	public List<Temoin> getListTemoin() {
		return listTemoin;
	}

	public void setListTemoin(List<Temoin> listTemoin) {
		this.listTemoin = listTemoin;
	}

	public List<Victime> getListVictime() {
		return listVictime;
	}

	public void setListVictime(List<Victime> listVictime) {
		this.listVictime = listVictime;
	}

	public List<AgentAffecte> getListAgentAffecte() {
		return listAgentAffecte;
	}

	public void setListAgentAffecte(List<AgentAffecte> listAgentAffecte) {
		this.listAgentAffecte = listAgentAffecte;
	}
	
}
