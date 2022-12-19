package me.greenhawk.bokapi.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Role {
    // Attributes
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    // Relations
    @OneToMany
    private List<Developer> developerList;
    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }
    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }
}
