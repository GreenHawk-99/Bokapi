package me.greenhawk.bokapi.service;

import me.greenhawk.bokapi.dto.DeveloperDTO;
import me.greenhawk.bokapi.dto.RoleDTO;
import me.greenhawk.bokapi.models.entities.Developer;
import me.greenhawk.bokapi.models.entities.Role;
import me.greenhawk.bokapi.models.repositories.DeveloperRepository;
import me.greenhawk.bokapi.models.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BokapplicationService {
    DeveloperRepository developerRepository;
    RoleRepository roleRepository;

    @Autowired
    public BokapplicationService(DeveloperRepository developerRepository, RoleRepository roleRepository) {
        this.developerRepository = developerRepository;
        this.roleRepository = roleRepository;
    }

    // Developer CRUD

    public List<Developer> getAllDeveloper() {
        return developerRepository.findAll();
    }
    public Developer getDeveloper(Long id) {
        return developerRepository.findById(id).orElseThrow();
    }
    public void saveDeveloper(DeveloperDTO developerDTO) {
        Developer developer;
        if (developerDTO.getId()==null) {
            developer = new Developer();
        } else {
            developer = developerRepository.findById(developerDTO.getId()).orElseThrow();
        }
        developer.setUsername(developerDTO.getUsername());
        developer.setDiscordId(developerDTO.getDiscordId());
        developer.setDiscordUsername(developerDTO.getDiscordUsername());
        developer.setDiscordTag(developerDTO.getDiscordTag());
        developer.setRole(developerDTO.getRole());
        developerRepository.save(developer);
    }
    public void deleteDeveloper(Long id) {
        developerRepository.deleteById(id);
    }

    // Role CRUD

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }
    public Role getRole(Long id) {
        return roleRepository.findById(id).orElseThrow();
    }
    public void saveRole(RoleDTO roleDTO) {
        Role role;
        if (roleDTO.getId()==null) {
            role = new Role();
        } else {
            role = roleRepository.findById(roleDTO.getId()).orElseThrow();
        }
        role.setName(roleDTO.getName());
        role.setDeveloperList(roleDTO.getDeveloperList());
        roleRepository.save(role);
    }
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
