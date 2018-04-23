package filrouge.gedesaft.model;

import java.util.Date;

public class Victime extends Personne {
	
	private Long id;
	private Date dateAgression;
	private String typeAgression;
	private boolean vivant;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDateAgression() {
		return dateAgression;
	}
	
	public void setDateAgression(Date dateAgression) {
		this.dateAgression = dateAgression;
	}
	
	public String getTypeAgression() {
		return typeAgression;
	}
	
	public void setTypeAgression(String typeAgression) {
		this.typeAgression = typeAgression;
	}
	
	public boolean isVivant() {
		return vivant;
	}
	
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	
}
