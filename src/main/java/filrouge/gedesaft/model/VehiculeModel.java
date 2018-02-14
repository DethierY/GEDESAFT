package filrouge.gedesaft.model;

import java.util.List;

public class VehiculeModel {
	
	private int id_vehicle;
	private String typeVehicule;
	private String marqueVehicule;
	private String modeleVehicule;
	private String immatriculationVehicule;
	private String couleurvehicule;
	private List<AffaireModel> listAffaireVehicule;
	private List<EmpreinteModel> listEmpreinteVehicule;
	private List<AdnModel> listAdnVehicule;
	private ProtagonnisteModelImpl protagonnisteVehicule;
	
	public VehiculeModel () {
		super();
	}

	public int getId_vehicle() {
		return id_vehicle;
	}

	public void setId_vehicle(int id_vehicle) {
		this.id_vehicle = id_vehicle;
	}

	public String getTypeVehicule() {
		return typeVehicule;
	}

	public void setTypeVehicule(String typeVehicule) {
		this.typeVehicule = typeVehicule;
	}

	public String getMarqueVehicule() {
		return marqueVehicule;
	}

	public void setMarqueVehicule(String marqueVehicule) {
		this.marqueVehicule = marqueVehicule;
	}

	public String getModeleVehicule() {
		return modeleVehicule;
	}

	public void setModeleVehicule(String modeleVehicule) {
		this.modeleVehicule = modeleVehicule;
	}

	public String getImmatriculationVehicule() {
		return immatriculationVehicule;
	}

	public void setImmatriculationVehicule(String immatriculationVehicule) {
		this.immatriculationVehicule = immatriculationVehicule;
	}

	public String getCouleurvehicule() {
		return couleurvehicule;
	}

	public void setCouleurvehicule(String couleurvehicule) {
		this.couleurvehicule = couleurvehicule;
	}

	public List<AffaireModel> getListAffairesVehicule() {
		return listAffaireVehicule;
	}

	public void setListAffairesVehicule(List<AffaireModel> listAffaireVehicule) {
		this.listAffaireVehicule = listAffaireVehicule;
	}

	public List<EmpreinteModel> getListEmpreintesVehicule() {
		return listEmpreinteVehicule;
	}

	public void setListEmpreintesVehicule(List<EmpreinteModel> listEmpreinteVehicule) {
		this.listEmpreinteVehicule = listEmpreinteVehicule;
	}

	public List<AdnModel> getListAdnVehicule() {
		return listAdnVehicule;
	}

	public void setListAdnVehicule(List<AdnModel> listAdnVehicule) {
		this.listAdnVehicule = listAdnVehicule;
	};
	
	public ProtagonnisteModelImpl getProtagonnisteVehicule() {
		return protagonnisteVehicule;
	}
	
	public void setProtagonnisteVehicule(ProtagonnisteModelImpl protagonnisteVehicule) {
		this.protagonnisteVehicule = protagonnisteVehicule;
	}
	
}
