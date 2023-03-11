package com.softuni.linkup.services.user;

import com.softuni.linkup.models.dtos.UserRegistrationDTO;

public interface UserService {
    boolean findUserByUsername(String username);

    boolean findUserByEmail(String email);

    void register(UserRegistrationDTO userRegistrationDTO);
}
