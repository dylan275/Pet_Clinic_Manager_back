package fr.univ_tours.polytech.pet_clinic_manager_back.controllers;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Vet;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.request.VetRequest;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.FindVetResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.FindVetsResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.MessageResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.repository.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/vet")
public class VetController {
    @Autowired
    VetRepository vetRepository;

    @GetMapping
    public ResponseEntity<?> findVets() {
        return ResponseEntity.ok(new FindVetsResponse(vetRepository.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findVet(@Valid @PathVariable Integer id) {
        return ResponseEntity.ok(new FindVetResponse(vetRepository.findById(id)));
    }

    @PostMapping
    public ResponseEntity<?> registerVet(@Valid @RequestBody VetRequest vetRequest) {
        // Create new pet
        Vet vet = new Vet(vetRequest.getFirstname(), vetRequest.getLastname(), vetRequest.getWorkTime(), vetRequest.getSalary());

        vetRepository.save(vet);

        return ResponseEntity.ok(new MessageResponse("Vet registered successfully!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putVet(@Valid @RequestBody VetRequest vetRequest, @PathVariable Integer id) {
        Vet vet = new Vet(vetRequest.getFirstname(), vetRequest.getLastname(), vetRequest.getWorkTime(), vetRequest.getSalary());
        vet.setId(id);

        vetRepository.save(vet);

        return ResponseEntity.ok(new FindVetResponse(vetRepository.findById(id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVet(@Valid @PathVariable Integer id) {
        if (vetRepository.findById(id) != null) {
            vetRepository.delete(vetRepository.findById(id));
            return ResponseEntity.ok(new MessageResponse("Vet deleted successfully!"));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
