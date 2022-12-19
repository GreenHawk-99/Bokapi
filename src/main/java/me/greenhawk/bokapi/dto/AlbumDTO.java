package me.greenhawk.bokapi.dto;

import me.greenhawk.bokapi.models.entities.Author;
import me.greenhawk.bokapi.models.entities.Music;

import java.util.List;

public class AlbumDTO {
    // Attributes
    private Long id;
    private String name;
    // Relations
    private Author author;
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
