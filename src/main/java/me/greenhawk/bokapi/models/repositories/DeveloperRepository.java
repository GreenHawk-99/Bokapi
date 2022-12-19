package me.greenhawk.bokapi.models.repositories;

import me.greenhawk.bokapi.models.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer,Long> {
}
