package com.softuni.linkup.services.user;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;
import com.softuni.linkup.models.entities.User;
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
    public User findUserByUsername(String username) {
        return this.userRepository.findUserByUsername(username);
    }

    @Override
    public User findUserByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }

    @Override
    public void register(UserRegistrationDTO userRegistrationDTO) {
        User user = new User();

        user
                .setFirstName(userRegistrationDTO.getFirstName())
                .setLastName(userRegistrationDTO.getLastName())
                .setEmail(userRegistrationDTO.getEmail())
                .setUsername(userRegistrationDTO.getUsername())
                .setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()))
                .setDateOfBirth(userRegistrationDTO.getDateOfBirth())
                .setGender(genderRepository.findAll().get(1));

        if (userRepository.count() == 0) {
            user.addRole(roleRepository.findAll().get(0));
        }

        user.addRole(roleRepository.findAll().get(1));

        userRepository.save(user);
    }
}
