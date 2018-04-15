package filrouge.gedesaft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import filrouge.gedesaft.model.Representation;
import filrouge.gedesaft.model.Vehicule;
import filrouge.gedesaft.service.VehiculeService;

// Classe gérant la liaison entre la base données, le serveur (cette application Spring Boot) et le client (application angular)
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

	// id de l'utilisateur entré en dur pour les tests, en attendant que cet id soit effectivement fournit par le client
	Long id_utilisateur = (long) 6;
	
	// injection d'une instance de la classe VehiculeService
	@Autowired
	private VehiculeService vehiculeService;

	// Méthode permettant d'obtenir la liste des représentations de véhicules (couple id_vehicule et type)
	// impliqués dans les affaires auxquelles l'utilsateur connecté est affecté
	// Renvoie une erreur 404 en cas d'échec de la requête
	// Renvoie la réponse 200 en cas de succès de la requête
	/**
	 * @return
	 */
	@GetMapping(value = "/list")
	public ResponseEntity<?> getListRepresentationVehiculeParDefaut(){
		List<Representation> listRepresentation = null; 
		try {
			listRepresentation = vehiculeService.getListRepresentationVehiculeParDefaut(id_utilisateur);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(listRepresentation);
	}

	// Méthode permettant d'obtenir les données d'un véhicule
	// Renvoie une erreur 404 en cas d'échec de la requête
	// Renvoie la réponse 200 en cas de succès de la requête
	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value= "{id}")
	public ResponseEntity<?> getVehiculeDetail(@PathVariable Long id) {
		Vehicule vehicule = null;
		try {
			vehicule = vehiculeService.getVehiculeDetail(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(vehicule);
	}
	
	// Méthode permettant d'obtenir la représentation du propriétaire (couple id_personne, nom) d'un véhicule
	// Renvoie une erreur 404 en cas d'échec de la requête
	// Renvoie la réponse 200 en cas de succès de la requête
	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value="{id}/proprietaire")
	public ResponseEntity<?> getProprietaireVehicule(@PathVariable Long id) {
		Representation proprietaire = null;
		try {
			proprietaire = vehiculeService.getRepresentationProprietaireVehicule(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(proprietaire);			
	}

	// Méthode permettant d'obtenir la liste des représentations des affaires (couple id_affaire, dossier) dans lesquelles un véhicule est impliqué
	// Renvoie une erreur 404 en cas d'échec de la requête
	// Renvoie la réponse 200 en cas de succès de la requête
	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value="{id}/affaires")
	public ResponseEntity<?> getAffairesImpliquantVehicule(@PathVariable Long id) {
		List<Representation> affaires;
		try {
			affaires = vehiculeService.getRepresentationAffairesImpliquantVehicule(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(affaires);			
	}
	
	// Méthode permettant d'ajouter un nouveau vehicule dans la base de données
	// Renvoie une erreur 400 si l'attribut type est null
	// Renvoie une erreur 500 en cas d'échec de la requête
	// Renvoie la réponse 201 en cas de succès de la requête
	/**
	 * @param vehicule
	 * @return
	 */
	@PostMapping(value ="/create")
	public ResponseEntity<?> addVehicule (@RequestBody Vehicule vehicule){
		String typeVehicule = vehicule.getType();
		if((typeVehicule == null) || (typeVehicule.isEmpty()))
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Le type de véhicule n'est pas défini!");		
		try {
			vehiculeService.addVehicule(vehicule);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
	
}
