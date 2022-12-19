package me.greenhawk.bokapi.models.repositories;

import me.greenhawk.bokapi.models.entities.Author;
import me.greenhawk.bokapi.models.entities.Genre;
import me.greenhawk.bokapi.models.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Long> {
    @Query(value = "select * from Music where bestOfBoki is true", nativeQuery = true)
    List<Music> getBestOfBoki();

    @Transactional
    @Modifying
    @Query("update Music m set m.id = ?1, m.url = ?2, m.bestOfBoki = ?3, m.author = ?4, m.genre = ?5")
    int updateIdAndUrlAndBestOfBokiAndAuthorAndGenreBy(Long id, String url, boolean bestOfBoki, Author author, Genre genre);
}
