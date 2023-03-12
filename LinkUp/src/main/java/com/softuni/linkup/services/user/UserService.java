package com.softuni.linkup.services.user;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;
import com.softuni.linkup.models.entities.User;

public interface UserService {
    User findUserByUsername(String username);

    User findUserByEmail(String email);

    void register(UserRegistrationDTO userRegistrationDTO);
}
