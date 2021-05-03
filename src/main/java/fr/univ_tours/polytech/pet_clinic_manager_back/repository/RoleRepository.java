package fr.univ_tours.polytech.pet_clinic_manager_back.repository;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.ERole;
import fr.univ_tours.polytech.pet_clinic_manager_back.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}