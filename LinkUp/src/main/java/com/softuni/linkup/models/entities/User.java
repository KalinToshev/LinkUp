package com.softuni.linkup.models.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "date_of_birth", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne(cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "gender_id", nullable = false)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<User> friends = new LinkedHashSet<>();

    @OneToMany(orphanRemoval = true)
    private Set<Role> roles = new LinkedHashSet<>();

    public User() {
        this.roles = new HashSet<>();
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public User setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }
}