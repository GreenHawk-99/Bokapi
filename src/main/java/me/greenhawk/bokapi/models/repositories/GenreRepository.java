package me.greenhawk.bokapi.models.repositories;

import me.greenhawk.bokapi.models.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
