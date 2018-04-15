package filrouge.gedesaft.model;

public class Personne {
	
	private Long id_personne;
	private String nom;
	private String prenom;
	
	public Personne() {
		super();
	}

	public Long getId_personne() {
		return id_personne;
	}

	public void setId_personne(Long id_personne) {
		this.id_personne = id_personne;
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

}
