package me.greenhawk.bokapi.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genre {
    // Attributes
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    // Relations
    @OneToMany
    private List<Music> musicList;
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

    public List<Music> getMusicList() {
        return musicList;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
