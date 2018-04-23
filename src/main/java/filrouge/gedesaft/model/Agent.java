package filrouge.gedesaft.model;

import java.util.Date;

public class Agent extends Personne {

	private Long id;
	private Date dateAffection;
	
	public Long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDateAffection() {
		return dateAffection;
	}
	
	public void setDateAffection(Date dateAffection) {
		this.dateAffection = dateAffection;
	}

}
