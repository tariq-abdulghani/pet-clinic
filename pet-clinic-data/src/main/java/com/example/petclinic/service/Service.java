package com.example.petclinic.service;

import java.util.Set;

public interface Service <T> {
    T fidById(Long id);
    T save(T t);
    Set<T> findAll();
}
