package com.softuni.linkup.models.entities;

import com.softuni.linkup.models.enums.Roles;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, unique = true)
    private Roles role;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.MERGE)
    private Set<User> users = new LinkedHashSet<>();

    public Role() {
    }

    public Roles getRole() {
        return role;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Role setRole(Roles role) {
        this.role = role;
        return this;
    }

    public Role setUsers(Set<User> users) {
        this.users = users;
        return this;
    }
}