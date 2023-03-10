package com.softuni.linkup.services.user;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;
import com.softuni.linkup.models.entities.User;
import com.softuni.linkup.models.enums.Roles;
import com.softuni.linkup.repositories.RoleRepository;
import com.softuni.linkup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
