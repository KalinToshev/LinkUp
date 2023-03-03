package com.softuni.linkup.services.gender;

import com.softuni.linkup.models.entities.Gender;
import com.softuni.linkup.models.enums.Genders;
import com.softuni.linkup.repositories.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class GenderServiceImpl implements GenderService {
    private final GenderRepository genderRepository;

    @Autowired
    public GenderServiceImpl(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    @Override
    public void initGenders() {
        if (this.genderRepository.count() != 0) return;

        Arrays.stream(Genders.values())
                .forEach(_gender -> {
                    Gender gender = new Gender().setGender(_gender);
                    this.genderRepository.save(gender);
                });
    }
}
