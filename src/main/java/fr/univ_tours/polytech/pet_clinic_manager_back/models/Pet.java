package fr.univ_tours.polytech.pet_clinic_manager_back.models;

import javax.persistence.*;

@Entity
@Table(name = "pet",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "id")
        })
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String datebirth;

    private String gender;

    private String type;

    private String breed;

    private String owner;

    public Pet() {
    }

    public Pet(String name, String datebirth, String gender, String type, String breed, String owner) {
        this.name = name;
        this.datebirth = datebirth;
        this.gender = gender;
        this.type = type;
        this.breed = breed;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
