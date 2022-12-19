package me.greenhawk.bokapi.models.repositories;

import me.greenhawk.bokapi.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
