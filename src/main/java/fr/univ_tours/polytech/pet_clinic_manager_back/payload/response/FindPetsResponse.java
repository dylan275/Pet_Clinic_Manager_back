package fr.univ_tours.polytech.pet_clinic_manager_back.payload.response;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Pet;

import java.util.List;

public class FindPetsResponse {
    private List<Pet> pets;

    public FindPetsResponse(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
