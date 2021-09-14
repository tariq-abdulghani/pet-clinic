package com.example.petclinic.map;

import com.example.petclinic.model.Owner;
import com.example.petclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Long, Owner> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        map.put(owner.getId(), owner);
        return owner;
    }
}
