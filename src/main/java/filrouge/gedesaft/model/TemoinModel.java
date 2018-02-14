package filrouge.gedesaft.model;

public class TemoinModel extends ProtagonnisteModelImpl {
	
	private int id_temoin;
	private String temoignageTemoin;

	public TemoinModel() {
		super();
	}

	public int getId_temoin() {
		return id_temoin;
	}

	public void setId_temoin(int id_temoin) {
		this.id_temoin = id_temoin;
	}

	public String getTemoignageTemoin() {
		return temoignageTemoin;
	}

	public void setTemoignageTemoin(String temoignageTemoin) {
		this.temoignageTemoin = temoignageTemoin;
	}
	
}
