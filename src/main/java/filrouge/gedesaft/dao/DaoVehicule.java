package filrouge.gedesaft.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import filrouge.gedesaft.model.Representation;
import filrouge.gedesaft.model.Vehicule;

// Classe de lancement des méthodes de la classe DaoImpl pour les véhicules
public class DaoVehicule extends DataDaoImpl {
	
	
	public DaoVehicule(JdbcTemplate jdbcTemplate, DataSource datasource) {
		super(jdbcTemplate);
	}
	
	// Requête pour obtenir une liste de Representation (id_vehicule, type) des véhicules
	// impliqués dans les affaires auxquelles est affecté l'utilisateur connecté au client
	/**
	 * @param id_utilisateur
	 * @return
	 * @throws Exception
	 */
	public List<Representation> getListRepresentationVehiculeParDefaut(Long id_utilisateur) throws Exception {	
		Long idRecherche = id_utilisateur;
		String idVehicule = "id_vehicule";
		String type = "type";
		String request = "SELECT DISTINCT vehicule.id_vehicule, vehicule.type FROM vehicule"
				+ " JOIN vehicule_implique ON vehicule.id_vehicule = vehicule_implique.id_vehicule"
				+ " JOIN affaire ON vehicule_implique.id_affaire = affaire.id"
				+ " JOIN agent_affecte ON agent_affecte.id_affaire = affaire.id"
				+ " JOIN personne ON personne.id = agent_affecte.id_personne"
				+ " WHERE personne.id = ? ";
		return getListRepresentationData(idRecherche, idVehicule, type, request);
	}

	// Requête pour obtenir un véhicule en fonction de son id_vehicule
	/**
	 * @param id_vehicule
	 * @return
	 * @throws Exception
	 */
	public Vehicule getVehicule(Long id_vehicule) throws Exception {
		String typeVehicule = "vehicule";
		Long idVehicule = id_vehicule;
		String request = "SELECT * FROM vehicule WHERE id_vehicule = ?";
		return (Vehicule) getObjectData(typeVehicule, idVehicule, request);
	}
	
	// Requête pour obtenir une Liste de Representation (id_affaire, dossier) des affaires dans lesquelles un véhicule est impliqués
	/**
	 * @param id_vehicule
	 * @return
	 * @throws Exception
	 */
	public List<Representation> getListRepresentationAffairesImpliquantVehicule(Long id_vehicule) throws Exception {	
		Long idRecherche = id_vehicule;
		String idAffaire = "id";
		String nom = "nom";
		String request = "SELECT DISTINCT affaire.id, nom FROM affaire"
				+ " JOIN vehicule_implique ON affaire.id = vehicule_implique.id_affaire" 
				+ " JOIN vehicule ON vehicule_implique.id_vehicule = vehicule.id_vehicule"
				+ " WHERE vehicule.id_vehicule = ?";
		return getListRepresentationData(idRecherche, idAffaire, nom, request);
	}
	
	// Requête pour obtenir la Representaiton (id_personne, nom) du propriétaire d'un véhicule
	/**
	 * @param id_vehicule
	 * @return
	 * @throws Exception
	 */
	public Representation getRepresentationProprietaireVehicule(Long id_vehicule) throws Exception {
		Long idVehicule = id_vehicule;
		String idProprietaire = "id";
		String name = "nom";
		String request = "SELECT DISTINCT personne.id, nom FROM personne"
				+ " JOIN vehicule on personne.id = vehicule.id_personne"
				+ " WHERE vehicule.id_vehicule = ?";
		return getRepresentationData(idVehicule, idProprietaire, name, request);
	}

}
