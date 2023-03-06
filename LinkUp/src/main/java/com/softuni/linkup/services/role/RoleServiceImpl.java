package com.softuni.linkup.services.role;

import com.softuni.linkup.models.entities.Role;
import com.softuni.linkup.models.enums.Roles;
import com.softuni.linkup.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void initRoles() {
        if (this.roleRepository.count() != 0) return;

        Arrays.stream(Roles.values())
                .forEach(_role -> {
                    Role role = new Role();
                    role.setRole(_role);
                    this.roleRepository.save(role);
                });
    }
}
