package com.example.petclinic.service.map;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Long, Vet> implements VetService {
	
    @Override
    public Vet save(Vet vet) {
        return map.put(vet.getId(), vet);
    }
}
