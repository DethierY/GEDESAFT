package filrouge.gedesaft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import filrouge.gedesaft.model.Affaire;
import filrouge.gedesaft.model.Vehicule;
import filrouge.gedesaft.service.VehiculeService;

// Classe gérant la liaison entre la base données, le serveur (cette application Spring Boot) et le client (application angular)
@CrossOrigin(origins = "http://localhost:4200", maxAge = 36000)
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
	
	// injection d'une instance de la classe VehiculeService
	@Autowired
	private VehiculeService vehiculeService;

	// Méthode permettant d'obtenir les données d'un véhicule
	// Renvoie une erreur 404 en cas d'échec de la requête
	// Renvoie la réponse 200 en cas de succès de la requête
	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value= "/{id}")
	public ResponseEntity<?> getVehiculeDetails(@PathVariable Long id) {
		System.out.println("getVehicule, id: " + id);
		Vehicule vehicule = null;
		try {
			vehicule = vehiculeService.getVehiculeDetail(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(vehicule);
	}
	
	@GetMapping(value= "/list")
	public ResponseEntity<?> getAllVehicule() {
		System.out.println("getAllVehicule");
		List<Vehicule> listVehicules = null;
		try {
			listVehicules = vehiculeService.getAllVehicules();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(listVehicules);
	}
	
	@PostMapping(value ="/create")
	public ResponseEntity<?> addVehicule (@RequestBody Vehicule vehicule){
		System.out.println("addVehicule");
		Vehicule createdVehicule;
		String typeVehicule = vehicule.getType();
		if((typeVehicule == null) || (typeVehicule.isEmpty()))
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Le type de véhicule n'est pas défini!");		
		try {
			createdVehicule = vehiculeService.addVehicule(vehicule);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createdVehicule);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<?> updateVehicule(@RequestBody Vehicule vehicule,@PathVariable Long id) throws Exception {
		System.out.println("updateVehicule, id: " + id);
		Vehicule result = null;
		String type = vehicule.getType();
		if((type == null) || (type.isEmpty()))
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Le type de véhicule n'est pas renseigné !");
		try {
			result = vehiculeService.updateVehicule(id, vehicule);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		if (result == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Immatriculation non conforme");
		}
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteVehicule(@PathVariable Long id){
		System.out.println("deleteVehicule, id: " + id);
		try {
		vehiculeService.deleteVehicule(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@GetMapping(value= "/{id}/affaires")
	public ResponseEntity<?> getAllAffairesOfVehicule(@PathVariable Long id) {
		System.out.println("getAllAffairesOfvehicule, id: " + id);
		List<Affaire> listAffaires = null;
		try {
			listAffaires = vehiculeService.getAllAffairesOfVehicule(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(listAffaires);
	}
}
