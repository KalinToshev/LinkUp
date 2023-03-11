package com.softuni.linkup.services.user;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;
import com.softuni.linkup.models.entities.Role;
import com.softuni.linkup.models.entities.User;
import com.softuni.linkup.models.enums.Roles;
import com.softuni.linkup.repositories.GenderRepository;
import com.softuni.linkup.repositories.RoleRepository;
import com.softuni.linkup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final GenderRepository genderRepository;

    private final RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, GenderRepository genderRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.genderRepository = genderRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public boolean findUserByUsername(String username) {
        return this.userRepository.findUserByUsername(username).isPresent();
    }

    @Override
    public boolean findUserByEmail(String email) {
        return this.userRepository.findUserByEmail(email).isPresent();
    }

    @Override
    public void register(UserRegistrationDTO userRegistrationDTO) {
        //TODO: Implement logic for user registration and find a way to fix the gender issue
    }
}
