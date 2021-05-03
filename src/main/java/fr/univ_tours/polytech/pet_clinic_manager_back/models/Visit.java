package fr.univ_tours.polytech.pet_clinic_manager_back.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "visit",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "id")
        })
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dateEntry;

    private String dateLeaving;

    private String description;

    private Integer petWeight;

    @OneToOne
    @JoinColumn(name = "idVet", referencedColumnName = "id")
    private Vet idVet;

    @OneToOne
    @JoinColumn(name = "idPet", referencedColumnName = "id")
    private Pet idPet;

    public Visit() {
    }

    public Visit(String dateEntry, String dateLeaving, String description, Integer petWeight, Vet idVet, Pet idPet) {
        this.dateEntry = dateEntry;
        this.dateLeaving = dateLeaving;
        this.description = description;
        this.petWeight = petWeight;
        this.idVet = idVet;
        this.idPet = idPet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Vet getIdVet() {
        return idVet;
    }

    public void setIdVet(Vet idVet) {
        this.idVet = idVet;
    }

    public Pet getIdPet() {
        return idPet;
    }

    public void setIdPet(Pet idPet) {
        this.idPet = idPet;
    }
}
