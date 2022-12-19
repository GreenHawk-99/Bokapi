package me.greenhawk.bokapi.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    // Attributes
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    // Relations
    @OneToMany
    private List<Music> musicList;
    @OneToMany
    private List<Album> albumList;
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

    public List<Album> getAlbumList() {
        return albumList;
    }
    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }
}
