package io.swagger.sample.service;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.swagger.sample.db.mapper.PetMapper;
import io.swagger.sample.model.Pet;
import org.mybatis.guice.transactional.Transactional;

@Singleton
public class PetService {

    private final PetMapper petMapper;

    @Inject
    public PetService(PetMapper petMapper) {
        this.petMapper = petMapper;
    }

    @Transactional
    public Pet createPet(Pet pet) {
        this.petMapper.createPet(pet);
        return pet;
    }
}
