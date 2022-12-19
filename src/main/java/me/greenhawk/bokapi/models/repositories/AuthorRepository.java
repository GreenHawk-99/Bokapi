package me.greenhawk.bokapi.models.repositories;

import me.greenhawk.bokapi.models.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
