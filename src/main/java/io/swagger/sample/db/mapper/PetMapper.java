package io.swagger.sample.db.mapper;

import io.swagger.sample.model.Pet;

import org.apache.ibatis.annotations.Param;

public interface PetMapper {

    /**
     * @param pet
     * @return The number of rows inserted
     */
    int createPet(@Param("pet") Pet pet);
}
