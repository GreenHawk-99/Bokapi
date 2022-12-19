package me.greenhawk.bokapi.service;

import me.greenhawk.bokapi.dto.AlbumDTO;
import me.greenhawk.bokapi.dto.AuthorDTO;
import me.greenhawk.bokapi.dto.GenreDTO;
import me.greenhawk.bokapi.dto.MusicDTO;
import me.greenhawk.bokapi.models.entities.Album;
import me.greenhawk.bokapi.models.entities.Author;
import me.greenhawk.bokapi.models.entities.Genre;
import me.greenhawk.bokapi.models.entities.Music;
import me.greenhawk.bokapi.models.repositories.AlbumRepository;
import me.greenhawk.bokapi.models.repositories.AuthorRepository;
import me.greenhawk.bokapi.models.repositories.GenreRepository;
import me.greenhawk.bokapi.models.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BokusicService {
    MusicRepository musicRepository;
    AuthorRepository authorRepository;
    AlbumRepository albumRepository;
    GenreRepository genreRepository;

    @Autowired
    public BokusicService(MusicRepository musicRepository, AuthorRepository authorRepository,AlbumRepository albumRepository, GenreRepository genreRepository) {
        this.musicRepository = musicRepository;
        this.authorRepository = authorRepository;
        this.albumRepository = albumRepository;
        this.genreRepository = genreRepository;
    }

    // Music CRUD

    public List<Music> getAllMusic() {
        return musicRepository.findAll();
    }
    public Music getMusic(Long id) {
        return musicRepository.findById(id).orElseThrow();
    }
    public List<Music> getBestOfBoki() {
        return musicRepository.getBestOfBoki();
    }
    /**
     * Save is method about creating or updating the object Music
     * @param musicDTO Attributes are taken from DTO to apply them on the object
     */
    public void saveMusic(MusicDTO musicDTO) {
        Music music;
        if (musicDTO.getId()==null) {
            music = new Music();
        } else {
            music = musicRepository.findById(musicDTO.getId()).orElseThrow();
        }
        music.setUrl(musicDTO.getUrl().trim());
        music.setBestOfBoki(musicDTO.isBestOfBoki());
        music.setAuthor(musicDTO.getAuthor());
        music.setAlbum(musicDTO.getAlbum());
        music.setGenre(musicDTO.getGenre());
        musicRepository.save(music);
    }
    public void deleteMusic(Long id) {
        musicRepository.deleteById(id);
    }

    // Author CRUD

    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }
    public Author getAuthor(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }
    public void saveAuthor(AuthorDTO authorDTO) {
        Author author;
        if (authorDTO.getId()==null) {
            author = new Author();
        } else {
            author = authorRepository.findById(authorDTO.getId()).orElseThrow();
        }
        author.setName(authorDTO.getName());
        author.setMusicList(authorDTO.getMusicList());
        author.setAlbumList(authorDTO.getAlbumList());
        authorRepository.save(author);
    }
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    // Album CRUD

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }
    public Album getAlbum(Long id) {
        return albumRepository.findById(id).orElseThrow();
    }
    public void saveAlbum(AlbumDTO albumDTO) {
        Album album;
        if (albumDTO.getId()==null) {
            album = new Album();
        } else {
            album = albumRepository.findById(albumDTO.getId()).orElseThrow();
        }
        album.setName(albumDTO.getName());
        album.setAuthor(albumDTO.getAuthor());
        album.setMusicList(albumDTO.getMusicList());
        albumRepository.save(album);
    }
    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }

    // Genre CRUD

    public List<Genre> getAllGenre() {
        return genreRepository.findAll();
    }
    public Genre getGenre(Long id) {
        return genreRepository.findById(id).orElseThrow();
    }
    public void saveGenre(GenreDTO genreDTO) {
        Genre genre;
        if (genreDTO.getId()==null) {
            genre = new Genre();
        } else {
            genre = genreRepository.findById(genreDTO.getId()).orElseThrow();
        }
        genre.setName(genreDTO.getName());
        genre.setMusicList(genreDTO.getMusicList());
        genreRepository.save(genre);
    }
    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}
