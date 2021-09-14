package com.example.petclinic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class  AbstractMapService <ID, T> {

    protected final Map<ID, T> map = new HashMap<>();

    public T fidById(ID id) {
        return map.get(id);
    }

    public T save(ID id, T t) {
        map.put(id, t);
        return t;
    }

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }
}
