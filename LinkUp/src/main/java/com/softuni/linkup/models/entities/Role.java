package com.softuni.linkup.models.entities;

import com.softuni.linkup.models.enums.Roles;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, unique = true)
    private Roles role;

    public Role() {
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}