package com.example.petclinic.map;

import org.springframework.stereotype.Service;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.CrudService;

@Service
public class VetServiceMap extends AbstractMapService<Long, Vet> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return map.put(vet.getId(), vet);
    }
}
