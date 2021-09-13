package com.example.petclinic.service;

import com.example.petclinic.model.Owner;

public interface OwnerService extends Service<Owner> {
    Owner findByLastName(String lastName);
}
