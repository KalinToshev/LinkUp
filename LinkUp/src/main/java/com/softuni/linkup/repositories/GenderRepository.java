package com.softuni.linkup.repositories;

import com.softuni.linkup.models.entities.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Long> {
}