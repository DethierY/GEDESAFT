package filrouge.gedesaft.model;

public class Arme {
	
	private Long id_arme;
	private String type;
	private Long numeroSerie;
	private String modele;
	private String calibre;
	private Personne Proprietaire;
	
	public Arme () {
		super();
	}

	public Long getId_arme() {
		return id_arme;
	}

	public void setId_arme(Long id_arme) {
		this.id_arme = id_arme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(Long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public Personne getProprietaire() {
		return Proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		Proprietaire = proprietaire;
	}

}
