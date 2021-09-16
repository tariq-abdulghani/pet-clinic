package com.example.petclinic.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.CrudService;
import com.example.petclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Long, Vet> implements VetService {
	
    @Override
    public Vet save(Vet vet) {
        return map.put(vet.getId(), vet);
    }
}
