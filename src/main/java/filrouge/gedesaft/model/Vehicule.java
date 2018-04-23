package filrouge.gedesaft.model;

public class Vehicule {
	
	private Long id_vehicule;
	private String type;
	private String marque;
	private String modele;
	private String immatriculation;
	private String couleur;
	private Personne proprietaire;
	
	public Vehicule () {
		super();
	}

	public Long getId_vehicule() {
		return id_vehicule;
	}

	public void setId_vehicule(Long id_vehicule) {
		this.id_vehicule = id_vehicule;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
