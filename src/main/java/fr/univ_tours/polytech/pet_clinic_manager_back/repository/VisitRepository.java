package fr.univ_tours.polytech.pet_clinic_manager_back.repository;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
    Visit findById(Integer id);
}
