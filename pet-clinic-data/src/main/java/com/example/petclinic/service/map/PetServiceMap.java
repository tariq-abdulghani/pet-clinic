package com.example.petclinic.service.map;

import com.example.petclinic.model.Pet;
import com.example.petclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Long, Pet> implements PetService {
	
    @Override
    public Pet save(Pet pet) {
        return map.put(pet.getId(), pet);
    }
}
