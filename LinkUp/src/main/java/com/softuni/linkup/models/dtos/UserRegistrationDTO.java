package com.softuni.linkup.models.dtos;

import com.softuni.linkup.models.entities.Gender;

import java.time.LocalDate;

public class UserRegistrationDTO {
    private String firstName;

    private String lastName;

    private String username;

    private LocalDate dateOfBirth;

    private String email;

    private String password;

    private String confirmPassword;

    private Gender gender;

    public UserRegistrationDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegistrationDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegistrationDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserRegistrationDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public UserRegistrationDTO setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegistrationDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegistrationDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegistrationDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public UserRegistrationDTO setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}
