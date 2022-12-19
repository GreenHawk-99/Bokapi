package me.greenhawk.bokapi.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {
    // Attributes
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    // Relations
    @ManyToOne
    private Author author;
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

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
