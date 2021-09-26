package com.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.petclinic.model.Visit;

public interface VisitRepositroy extends CrudRepository<Visit, Long> {

}
