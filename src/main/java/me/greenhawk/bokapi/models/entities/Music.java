package me.greenhawk.bokapi.models.entities;

import jakarta.persistence.*;

@Entity
public class Music {
    // Attributes
    @Id
    @GeneratedValue
    private Long id;
    private String url;
    private boolean bestOfBoki;
    // Relations
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isBestOfBoki() {
        return bestOfBoki;
    }
    public void setBestOfBoki(boolean bestOfBoki) {
        this.bestOfBoki = bestOfBoki;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
