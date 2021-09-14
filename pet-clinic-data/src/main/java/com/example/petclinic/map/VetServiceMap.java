package com.example.petclinic.map;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Long, Vet> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return map.put(vet.getId(), vet);
    }
}
