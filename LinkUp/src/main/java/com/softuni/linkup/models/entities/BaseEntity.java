package com.softuni.linkup.models.entities;

import jakarta.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }
}