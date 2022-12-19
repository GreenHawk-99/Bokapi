package me.greenhawk.bokapi.dto;

import me.greenhawk.bokapi.models.entities.Album;
import me.greenhawk.bokapi.models.entities.Music;

import java.util.List;

public class AuthorDTO {
    // Attributes
    private Long id;
    private String name;
    // Relations
    private List<Music> musicList;
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
