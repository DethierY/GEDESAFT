package filrouge.gedesaft.model;

public class Suspect {
	
	private Long id_suspect;
	private String nom;
	private String prenom;
	private String signeParticulier;
	private String couleurPeau;
	private String couleurCheveux;
	private Integer taille;
	
	public Suspect () {
		super();
	}

	public Long getId_suspect() {
		return id_suspect;
	}

	public void setId_suspect(Long id_suspect) {
		this.id_suspect = id_suspect;
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

	public String getSigneParticulier() {
		return signeParticulier;
	}

	public void setSigneParticulier(String signeParticulier) {
		this.signeParticulier = signeParticulier;
	}

	public String getCouleurPeau() {
		return couleurPeau;
	}

	public void setCouleurPeau(String couleurPeau) {
		this.couleurPeau = couleurPeau;
	}

	public String getCouleurCheveux() {
		return couleurCheveux;
	}

	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}

}
