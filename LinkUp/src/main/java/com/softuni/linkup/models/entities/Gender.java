package com.softuni.linkup.models.entities;

import com.softuni.linkup.models.enums.Genders;
import jakarta.persistence.*;

@Entity
@Table(name = "genders")
public class Gender extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false, unique = true)
    private Genders gender;

    public Gender() {
    }

    public Genders getGender() {
        return gender;
    }

    public Gender setGender(Genders gender) {
        this.gender = gender;
        return this;
    }
}