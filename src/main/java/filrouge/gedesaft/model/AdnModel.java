package filrouge.gedesaft.model;

import java.util.ArrayList;

public class AdnModel {
	
	private int id_ADN;
	private String ADN;
	private ProtagonnisteModelImpl protagonnisteAdn;
	private ArrayList<ArmeModel> listArmeAdn;
	private ArrayList<VehiculeModel> listVehiculeAdn;
	
	public AdnModel() {
		super();
	}

	public int getId_ADN() {
		return id_ADN;
	}

	public void setId_ADN(int id_ADN) {
		this.id_ADN = id_ADN;
	}

	public String getADN() {
		return ADN;
	}

	public void setADN(String aDN) {
		ADN = aDN;
	}

	public ProtagonnisteModelImpl getPersonneAdn() {
		return protagonnisteAdn;
	}

	public void setPersonneAdn(ProtagonnisteModelImpl protagonnisteAdn) {
		this.protagonnisteAdn = protagonnisteAdn;
	}

	public ArrayList<ArmeModel> getListArmeAdn() {
		return listArmeAdn;
	}

	public void setListArmeAdn(ArrayList<ArmeModel> listArmeAdn) {
		this.listArmeAdn = listArmeAdn;
	}

	public ArrayList<VehiculeModel> getListVehiculeAdn() {
		return listVehiculeAdn;
	}

	public void setListVehiculeAdn(ArrayList<VehiculeModel> listVehiculeAdn) {
		this.listVehiculeAdn = listVehiculeAdn;
	}

	
}
