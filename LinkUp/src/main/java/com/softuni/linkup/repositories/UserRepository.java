package com.softuni.linkup.repositories;

import com.softuni.linkup.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}