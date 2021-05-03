package fr.univ_tours.polytech.pet_clinic_manager_back.controllers;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Pet;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.request.PetRequest;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.FindPetResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.FindPetsResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.MessageResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/pet")
public class PetController {
    @Autowired
    PetRepository petRepository;

    @GetMapping
    public ResponseEntity<?> findPets() {
        return ResponseEntity.ok(new FindPetsResponse(petRepository.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findPet(@Valid @PathVariable Integer id) {
        return ResponseEntity.ok(new FindPetResponse(petRepository.findById(id)));
    }

    @PostMapping
    public ResponseEntity<?> registerPet(@Valid @RequestBody PetRequest petRequest) {
        // Create new pet
        Pet pet = new Pet(petRequest.getName(), petRequest.getDatebirth(), petRequest.getGender(), petRequest.getType(), petRequest.getBreed(), petRequest.getOwner());

        petRepository.save(pet);

        return ResponseEntity.ok(new MessageResponse("Pet registered successfully!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putPet(@Valid @RequestBody PetRequest petRequest, @PathVariable Integer id) {
        Pet pet = new Pet(petRequest.getName(), petRequest.getDatebirth(), petRequest.getGender(), petRequest.getType(), petRequest.getBreed(), petRequest.getOwner());
        pet.setId(id);

        petRepository.save(pet);

        return ResponseEntity.ok(new FindPetResponse(petRepository.findById(id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePet(@Valid @PathVariable Integer id) {
        if (petRepository.findById(id) != null) {
            petRepository.delete(petRepository.findById(id));
            return ResponseEntity.ok(new MessageResponse("Pet deleted successfully!"));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
