package fr.univ_tours.polytech.pet_clinic_manager_back.payload.response;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Pet;

public class FindPetResponse {
    private Pet pet;

    public FindPetResponse(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
