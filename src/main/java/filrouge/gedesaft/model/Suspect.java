package filrouge.gedesaft.model;

import java.util.Date;

public class Suspect {
	
	private Long id_suspect;
	private String pseudo;
	private String photo;
	private Date dateImplication;
	private String signeParticulier;
	private String couleurPeau;
	private String couleurCheveux;
	private Integer taille;
	private Personne identite;
	
	public Suspect () {
		super();
	}

	public Long getId_suspect() {
		return id_suspect;
	}

	public void setId_suspect(Long id_suspect) {
		this.id_suspect = id_suspect;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDateImplication() {
		return dateImplication;
	}

	public void setDateImplication(Date dateImplication) {
		this.dateImplication = dateImplication;
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

	public Personne getIdentite() {
		return identite;
	}

	public void setIdentite(Personne identite) {
		this.identite = identite;
	}

}
