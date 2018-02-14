package filrouge.gedesaft.model;

public class VictimeModel extends ProtagonnisteModelImpl {
	
	private int id_victime;
	private String typeAgressionVictime;
	
	public VictimeModel() {
		super();
	}

	public int getId_victime() {
		return id_victime;
	}

	public void setId_victime(int id_victime) {
		this.id_victime = id_victime;
	}

	public String getTypeAgressionVictime() {
		return typeAgressionVictime;
	}

	public void setTypeAgressionVictime(String typeAgressionVictime) {
		this.typeAgressionVictime = typeAgressionVictime;
	}
	
}
