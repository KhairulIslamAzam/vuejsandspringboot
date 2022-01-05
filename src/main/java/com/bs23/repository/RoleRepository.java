package com.bs23.repository;

import com.bs23.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
