package fr.univ_tours.polytech.pet_clinic_manager_back.repository;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet, Long> {
    Vet findById(Integer id);
}
