package me.greenhawk.bokapi.dto;

import me.greenhawk.bokapi.models.entities.Developer;

import java.util.List;

public class RoleDTO {
    // Attributes
    private Long id;
    private String name;
    // Relations
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
