package me.greenhawk.bokapi.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Developer {
    // Attributes
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String discordId;
    private String discordUsername;
    private String discordTag;
    // Relations
    @ManyToOne
    private Role role;
    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getDiscordId() {
        return discordId;
    }
    public void setDiscordId(String discordId) {
        this.discordId = discordId;
    }

    public String getDiscordUsername() {
        return discordUsername;
    }
    public void setDiscordUsername(String discordUsername) {
        this.discordUsername = discordUsername;
    }

    public String getDiscordTag() {
        return discordTag;
    }
    public void setDiscordTag(String discordTag) {
        this.discordTag = discordTag;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
