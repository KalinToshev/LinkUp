package com.softuni.linkup.repositories;

import com.softuni.linkup.models.entities.Role;
import com.softuni.linkup.models.enums.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}