package filrouge.gedesaft.model;

public class Victime {
	
	private Long id_victime;
	private String typeAggression;
	private boolean vivante;
	private String deposition;
	private Personne identite;
	
	public Victime() {
		super();
	}

	public Long getId_victime() {
		return id_victime;
	}

	public void setId_victime(Long id_victime) {
		this.id_victime = id_victime;
	}

	public String getTypeAggression() {
		return typeAggression;
	}

	public void setTypeAggression(String typeAggression) {
		this.typeAggression = typeAggression;
	}

	public boolean isVivante() {
		return vivante;
	}

	public void setVivante(boolean vivante) {
		this.vivante = vivante;
	}

	public String getDeposition() {
		return deposition;
	}

	public void setDeposition(String deposition) {
		this.deposition = deposition;
	}

	public Personne getIdentite() {
		return identite;
	}

	public void setIdentite(Personne identite) {
		this.identite = identite;
	}

}
