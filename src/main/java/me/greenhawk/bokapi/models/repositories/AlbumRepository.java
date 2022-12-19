package me.greenhawk.bokapi.models.repositories;

import me.greenhawk.bokapi.models.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long> {
}
