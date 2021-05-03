package fr.univ_tours.polytech.pet_clinic_manager_back.payload.request;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Pet;
import fr.univ_tours.polytech.pet_clinic_manager_back.models.Vet;

import javax.validation.constraints.NotBlank;

public class VisitRequest {
    private String dateEntry;

    private String dateLeaving;

    private String description;

    private Integer petWeight;

    private Vet vet;

    private Pet pet;

    public String getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(String dateEntry) {
        this.dateEntry = dateEntry;
    }

    public String getDateLeaving() {
        return dateLeaving;
    }

    public void setDateLeaving(String dateLeaving) {
        this.dateLeaving = dateLeaving;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(Integer petWeight) {
        this.petWeight = petWeight;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
