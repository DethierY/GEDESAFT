package filrouge.gedesaft.model;

public interface ProtagonnisteModelInterface {

	public int getId_personne();
	public void setId_personne(int id_personne);
	
	public String getNomPersonne();
	public void setNomPersonne(String nomPersonne);
	
	public String getPrenomPersonne();
	public void setPrenomPersonne(String PrenomPersonne);
	
	public String getStatutPersonne();
	public void setStatutPersonne(String StatutPersonne);
	
	public EmpreinteModel getEmpreinteProtagonniste();
	public void setEmpreinteProtagonniste(EmpreinteModel empreinteProtagonniste);
	
	public AdnModel getAdnProtagonniste();
	public void setAdnProtagonniste(AdnModel adnProtagonniste);
	
}
