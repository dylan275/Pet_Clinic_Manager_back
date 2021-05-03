package fr.univ_tours.polytech.pet_clinic_manager_back.payload.response;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Vet;

public class FindVetResponse {
    private Vet vet;

    public FindVetResponse(Vet vet) {
        this.vet = vet;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
