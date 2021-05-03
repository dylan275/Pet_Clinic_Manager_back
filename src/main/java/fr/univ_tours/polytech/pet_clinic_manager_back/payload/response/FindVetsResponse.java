package fr.univ_tours.polytech.pet_clinic_manager_back.payload.response;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Vet;

import java.util.List;

public class FindVetsResponse {
    private List<Vet> vets;

    public FindVetsResponse(List<Vet> vets) {
        this.vets = vets;
    }

    public List<Vet> getVets() {
        return vets;
    }

    public void setVets(List<Vet> vets) {
        this.vets = vets;
    }
}
