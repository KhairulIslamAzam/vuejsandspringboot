package com.bs23.repository;

import com.bs23.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByFirstName(String name);
}
