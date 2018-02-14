package filrouge.gedesaft.model;

import java.util.List;

public class PersonnelModel extends ProtagonnisteModelImpl {
	
	private int id_personnel;
	private String gradePersonnel;
	private int droitAccesPersonnel;
	private String identifiantPersonnel;
	private String passwordPersonnel;
	private List<AffaireModel> listAffairePersonnel;
	
	public PersonnelModel () {
		super();
	}

	public int getId_personnel() {
		return id_personnel;
	}

	public void setId_personnel(int id_personnel) {
		this.id_personnel = id_personnel;
	}

	public String getGradePersonnel() {
		return gradePersonnel;
	}

	public void setGradePersonnel(String gradePersonnel) {
		this.gradePersonnel = gradePersonnel;
	}
	
	public int getDroitAccesPersonnel() {
		return droitAccesPersonnel;
	}
	
	public void setDroitPersonnel(int droitAccesPersonnel) {
		this.droitAccesPersonnel = droitAccesPersonnel;
	}

	public String getIdentifiantPersonnel() {
		return identifiantPersonnel;
	}

	public void setIdentifiantPersonnel(String identifiantPersonnel) {
		this.identifiantPersonnel = identifiantPersonnel;
	}

	public String getPasswordPersonnel() {
		return passwordPersonnel;
	}

	public void setPasswordPersonnel(String passwordPersonnel) {
		this.passwordPersonnel = passwordPersonnel;
	}

	public List<AffaireModel> getListAffairePersonnel() {
		return listAffairePersonnel;
	}

	public void setListAffairePersonnel(List<AffaireModel> listAffairePersonnel) {
		this.listAffairePersonnel = listAffairePersonnel;
	}

	
}
