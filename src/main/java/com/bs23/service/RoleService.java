package com.bs23.service;

import com.bs23.entity.Role;
import com.bs23.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Service
public class RoleService {

    final RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public List<Role> getAll(){
        return this
                .repository.findAll();
    }

    public Role save(Role role){
        return this.repository.save(role);
    }

    public Optional<Role> getRoleById(Long id){
        return this.repository.findById(id);
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }
}
