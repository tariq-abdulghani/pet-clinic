package com.example.petclinic.service;

import java.util.Set;

public interface CrudService <T, ID> {
    T fidById(ID id);
    T save(T t);
    Set<T> findAll();
    void delete(T t);
    void deleteById(ID id);
}
