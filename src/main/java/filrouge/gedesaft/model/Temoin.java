package filrouge.gedesaft.model;

import java.util.Date;

public class Temoin {
	
	private int id_temoin;
	private Date dateDeposition;
	private String deposition;
	private Personne identite;
	
	public Temoin() {
		super();
	}

	public int getId_temoin() {
		return id_temoin;
	}

	public void setId_temoin(int id_temoin) {
		this.id_temoin = id_temoin;
	}

	public Date getDateDeposition() {
		return dateDeposition;
	}

	public void setDateDeposition(Date dateDeposition) {
		this.dateDeposition = dateDeposition;
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
