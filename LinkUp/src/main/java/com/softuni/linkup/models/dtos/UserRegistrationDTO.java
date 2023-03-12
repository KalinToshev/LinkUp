package com.softuni.linkup.models.dtos;

import com.softuni.linkup.models.entities.Gender;
import com.softuni.linkup.validations.annotation.UniqueEmail;
import com.softuni.linkup.validations.annotation.UniqueUsername;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class UserRegistrationDTO {
    @NotBlank(message = "First name cannot be empty.")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "First name should only contain alphabets and spaces.")
    @Size(max = 50, message = "First name should not exceed 50 characters.")
    private String firstName;

    @NotBlank(message = "Last name cannot be empty.")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Last name should only contain alphabets and spaces.")
    @Size(max = 50, message = "Last name should not exceed 50 characters.")
    private String lastName;

    @UniqueUsername
    @NotBlank(message = "Username cannot be empty.")
    @Pattern(regexp = "^[a-zA-Z0-9_-]*$", message = "Username should only contain alphanumeric characters, underscores, and hyphens.")
    @Size(min = 3, max = 20, message = "Username should be between 3 and 20 characters.")
    private String username;

    @NotNull(message = "Date of birth cannot be empty.")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Past(message = "Date of birth must be in the past.")
    private LocalDate dateOfBirth;

    @UniqueEmail
    @NotBlank(message = "Email address cannot be empty.")
    @Email(message = "Please enter a valid email address.")
    private String email;

    @NotBlank(message = "Password cannot be empty.")
    @Size(min = 8, message = "Password must be at least 8 characters long.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "Password must contain at least one uppercase letter, one lowercase letter, and one numeric digit.")
    private String password;

    @NotBlank(message = "Please confirm the password.")
    private String confirmPassword;

    @NotNull(message = "Gender cannot be empty.")
    private Gender gender;

    public UserRegistrationDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public Gender getGender() {
        return gender;
    }

    public UserRegistrationDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserRegistrationDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserRegistrationDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserRegistrationDTO setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public UserRegistrationDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserRegistrationDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserRegistrationDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public UserRegistrationDTO setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}
