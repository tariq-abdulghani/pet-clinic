package com.example.petclinic.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Pet;
import com.example.petclinic.service.CrudService;
import com.example.petclinic.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Long, Pet> implements PetService {
	
    @Override
    public Pet save(Pet pet) {
        return map.put(pet.getId(), pet);
    }
}
