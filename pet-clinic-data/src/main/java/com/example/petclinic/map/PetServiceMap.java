package com.example.petclinic.map;

import com.example.petclinic.model.Pet;
import com.example.petclinic.service.CrudService;

public class PetServiceMap extends AbstractMapService<Long, Pet> implements CrudService<Pet, Long> {
    @Override
    public Pet save(Pet pet) {
        return map.put(pet.getId(), pet);
    }
}
