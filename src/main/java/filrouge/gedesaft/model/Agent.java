package filrouge.gedesaft.model;

public class Agent {
	
	private Long id_agentAffecte;
	private String nom;
	private String prenom;
	private String grade;
	private boolean enService;
	
	public Agent () {
		super();
	}

	public Long getId_agentAffecte() {
		return id_agentAffecte;
	}

	public void setId_agentAffecte(Long id_agentAffecte) {
		this.id_agentAffecte = id_agentAffecte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean isEnService() {
		return enService;
	}

	public void setEnService(boolean enService) {
		this.enService = enService;
	}

}
