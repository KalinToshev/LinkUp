package com.softuni.linkup.services.user;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;
import com.softuni.linkup.models.entities.User;
import com.softuni.linkup.repositories.RoleRepository;
import com.softuni.linkup.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final RoleRepository roleRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
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

        modelMapper.map(userRegistrationDTO, user);

        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));

        if (userRepository.count() == 0) {
            user.addRole(roleRepository.findAll().get(0));
        }

        user.addRole(roleRepository.findAll().get(1));

        userRepository.save(user);
    }
}
