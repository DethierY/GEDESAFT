package filrouge.gedesaft.model;

import java.util.List;

public class ArmeModel {
	
	private int id_arme;
	private String modelArme;
	private String typeArme;
	private List<AdnModel> listAdnArme;
	private List<EmpreinteModel> listEmpreinteModel;
	private List<AffaireModel> listAffaireArme;
	private ProtagonnisteModelImpl protagonnisteArme;
	
	public ArmeModel() {
		super();
	}

	public int getId_arme() {
		return id_arme;
	}

	public void setId_arme(int id_arme) {
		this.id_arme = id_arme;
	}

	public String getModelArme() {
		return modelArme;
	}

	public void setModelArme(String modelArme) {
		this.modelArme = modelArme;
	}

	public String getTypeArme() {
		return typeArme;
	}

	public void setTypeArme(String typeArme) {
		this.typeArme = typeArme;
	}

	public List<AdnModel> getListAdnArme() {
		return listAdnArme;
	}

	public void setListAdnArme(List<AdnModel> listAdnArme) {
		this.listAdnArme = listAdnArme;
	}

	public List<EmpreinteModel> getListEmpreinteModel() {
		return listEmpreinteModel;
	}

	public void setListEmpreinteModel(List<EmpreinteModel> listEmpreinteModel) {
		this.listEmpreinteModel = listEmpreinteModel;
	}

	public List<AffaireModel> getListAffaireArme() {
		return listAffaireArme;
	}

	public void setListAffaireArme(List<AffaireModel> listAffaireArme) {
		this.listAffaireArme = listAffaireArme;
	}
	
	public ProtagonnisteModelImpl getProtagonnisteArme() {
		return protagonnisteArme;
	}
	
	public void setProtagonnisteArme(ProtagonnisteModelImpl protagonnisteArme) {
		this.protagonnisteArme = protagonnisteArme;
	}

}
