package filrouge.gedesaft.model;

import java.util.Date;

public class ArmeImpliquee {
	
	private Long id_armeImpliquee;
	private Date dateImplication;
	private Arme arme;
	
	public Long getId_armeImpliquee() {
		return id_armeImpliquee;
	}
	
	public void setId_armeImpliquee(Long id_armeImpliquee) {
		this.id_armeImpliquee = id_armeImpliquee;
	}
	
	public Date getDateImplication() {
		return dateImplication;
	}
	
	public void setDateImplication(Date dateImplication) {
		this.dateImplication = dateImplication;
	}
	
	public Arme getArme() {
		return arme;
	}
	
	public void setArme(Arme arme) {
		this.arme = arme;
	}
	
}
