package fr.univ_tours.polytech.pet_clinic_manager_back.models;

import javax.persistence.*;

@Entity
@Table(name = "vet",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "id")})
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstname;

    private String lastname;

    private Integer workTime;

    private Integer salary;

    public Vet() {
    }

    public Vet(String firstname, String lastname, Integer workTime, Integer salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.workTime = workTime;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
