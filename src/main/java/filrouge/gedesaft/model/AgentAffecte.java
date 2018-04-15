package filrouge.gedesaft.model;

import java.util.Date;

public class AgentAffecte {
	
	private Long id_agentAffecte;
	private Date dateAffectation;
	private String notes;
	private Personne identite;
	
	public AgentAffecte () {
		super();
	}

	public Long getId_agentAffecte() {
		return id_agentAffecte;
	}

	public void setId_agentAffecte(Long id_agentAffecte) {
		this.id_agentAffecte = id_agentAffecte;
	}

	public Date getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Personne getIdentite() {
		return identite;
	}

	public void setIdentite(Personne identite) {
		this.identite = identite;
	}

}
