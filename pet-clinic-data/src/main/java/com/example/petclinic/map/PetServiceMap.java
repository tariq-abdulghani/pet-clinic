package com.example.petclinic.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Pet;
import com.example.petclinic.service.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Long, Pet> implements CrudService<Pet, Long> {
    @Override
    public Pet save(Pet pet) {
        return map.put(pet.getId(), pet);
    }
}
