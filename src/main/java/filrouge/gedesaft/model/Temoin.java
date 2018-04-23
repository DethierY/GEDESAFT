package filrouge.gedesaft.model;

import java.util.Date;

public class Temoin extends Personne {
	
	private Long id;
	private Date dateDeposition;
	private String deposition;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
}
