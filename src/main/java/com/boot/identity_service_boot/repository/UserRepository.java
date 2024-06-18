package com.boot.identity_service_boot.repository;

import com.boot.identity_service_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean existsById(String id);
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
