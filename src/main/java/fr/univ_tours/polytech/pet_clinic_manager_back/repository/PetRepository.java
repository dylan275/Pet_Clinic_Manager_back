package fr.univ_tours.polytech.pet_clinic_manager_back.repository;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    Pet findById(Integer id);
}
