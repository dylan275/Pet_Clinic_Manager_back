package fr.univ_tours.polytech.pet_clinic_manager_back.controllers;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Visit;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.request.VisitRequest;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.FindVisitResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.FindVisitsResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.payload.response.MessageResponse;
import fr.univ_tours.polytech.pet_clinic_manager_back.repository.PetRepository;
import fr.univ_tours.polytech.pet_clinic_manager_back.repository.VetRepository;
import fr.univ_tours.polytech.pet_clinic_manager_back.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/visit")
public class VisitController {
    @Autowired
    VisitRepository visitRepository;

    @Autowired
    PetRepository petRepository;

    @Autowired
    VetRepository vetRepository;

    @GetMapping
    public ResponseEntity<?> findVisits() {
        return ResponseEntity.ok(new FindVisitsResponse(visitRepository.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findVisit(@Valid @PathVariable Integer id) {
        return ResponseEntity.ok(new FindVisitResponse(visitRepository.findById(id)));
    }

    @PostMapping
    public ResponseEntity<?> registerVisit(@Valid @RequestBody VisitRequest visitRequest) {
        Visit visit = new Visit(visitRequest.getDateEntry(), visitRequest.getDateLeaving(), visitRequest.getDescription(), visitRequest.getPetWeight(), visitRequest.getVet(), visitRequest.getPet());

        visitRepository.save(visit);

        return ResponseEntity.ok(new MessageResponse("Visit registered successfully!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putVisit(@Valid @RequestBody VisitRequest visitRequest, @PathVariable Integer id) {
        Visit visit = new Visit(visitRequest.getDateEntry(), visitRequest.getDateLeaving(), visitRequest.getDescription(), visitRequest.getPetWeight(), visitRequest.getVet(), visitRequest.getPet());
        visit.setId(id);

        visitRepository.save(visit);

        return ResponseEntity.ok(new FindVisitResponse(visitRepository.findById(id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVisit(@Valid @PathVariable Integer id) {
        if (visitRepository.findById(id) != null) {
            visitRepository.delete(visitRepository.findById(id));
            return ResponseEntity.ok(new MessageResponse("Visit deleted successfully!"));
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
