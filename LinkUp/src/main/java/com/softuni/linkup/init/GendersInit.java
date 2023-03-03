package com.softuni.linkup.init;

import com.softuni.linkup.services.gender.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GendersInit implements CommandLineRunner {
    private final GenderService genderService;

    @Autowired
    public GendersInit(GenderService genderService) {
        this.genderService = genderService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.genderService.initGenders();
    }
}
