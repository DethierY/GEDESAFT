package filrouge.gedesaft.model;

public class ProtagonnisteModelImpl implements ProtagonnisteModelInterface {
	
	private int id_personne;
	private String nomPersonne;
	private String prenomPersonne;
	private String statutPersonne;
	private EmpreinteModel empreinteProtagonniste;
	private AdnModel adnProtagonniste;
	
	public ProtagonnisteModelImpl() {
		super();
	}

	@Override
	public int getId_personne() {
		return id_personne;
	}

	@Override
	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}

	@Override
	public String getNomPersonne() {
		return nomPersonne;
	}

	@Override
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	@Override
	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	@Override
	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	@Override
	public String getStatutPersonne() {
		return statutPersonne;
	}

	@Override
	public void setStatutPersonne(String statutPersonne) {
		this.statutPersonne = statutPersonne;
	}

	@Override
	public EmpreinteModel getEmpreinteProtagonniste() {
		return empreinteProtagonniste;
	}

	@Override
	public void setEmpreinteProtagonniste(EmpreinteModel empreinteProtagonniste) {
		this.empreinteProtagonniste = empreinteProtagonniste;
	}

	@Override
	public AdnModel getAdnProtagonniste() {
		return adnProtagonniste;
	}

	@Override
	public void setAdnProtagonniste(AdnModel adnProtagonniste) {
		this.adnProtagonniste = adnProtagonniste;
	}

}
