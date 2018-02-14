package filrouge.gedesaft.model;

public class SuspectModel extends ProtagonnisteModelImpl {
	
	private int id_suspect;
	private String pseudoSuspect;
	private String photoSuspect;
	private String signeParticulierSuspect;
	private String couleurPeauSuspect;
	private String couleurCheveuxSuspct;
	private int tailleSuspect;
	
	public SuspectModel() {
		super();
	}

	public int getId_suspect() {
		return id_suspect;
	}

	public void setId_suspect(int id_suspect) {
		this.id_suspect = id_suspect;
	}

	public String getPseudoSuspect() {
		return pseudoSuspect;
	}

	public void setPseudoSuspect(String pseudoSuspect) {
		this.pseudoSuspect = pseudoSuspect;
	}

	public String getPhotoSuspect() {
		return photoSuspect;
	}

	public void setPhotoSuspect(String photoSuspect) {
		this.photoSuspect = photoSuspect;
	}

	public String getSigneParticulierSuspect() {
		return signeParticulierSuspect;
	}

	public void setSigneParticulierSuspect(String signeParticulierSuspect) {
		this.signeParticulierSuspect = signeParticulierSuspect;
	}

	public String getCouleurPeauSuspect() {
		return couleurPeauSuspect;
	}

	public void setCouleurPeauSuspect(String couleurPeauSuspect) {
		this.couleurPeauSuspect = couleurPeauSuspect;
	}

	public String getCouleurCheveuxSuspct() {
		return couleurCheveuxSuspct;
	}

	public void setCouleurCheveuxSuspct(String couleurCheveuxSuspct) {
		this.couleurCheveuxSuspct = couleurCheveuxSuspct;
	}

	public int getTailleSuspect() {
		return tailleSuspect;
	}

	public void setTailleSuspect(int tailleSuspect) {
		this.tailleSuspect = tailleSuspect;
	}

}
