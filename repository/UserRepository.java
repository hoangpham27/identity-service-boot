package com.boot.identity_service_boot.repository;

import com.boot.identity_service_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
