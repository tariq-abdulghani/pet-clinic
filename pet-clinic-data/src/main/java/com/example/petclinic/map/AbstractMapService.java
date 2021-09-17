package com.example.petclinic.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.example.petclinic.model.BaseEntity;

public abstract class  AbstractMapService <ID extends Long, T extends BaseEntity> {

    protected final Map<ID, T> map = new HashMap<>();

    public T fidById(ID id) {
        return map.get(id);
    }
    
    

    @SuppressWarnings("unchecked")
	public T save(T t) {
    	System.out.println("save owners............");
		if (t.getId() == null) {
			Long id = getNextID();
			t.setId(id);
			map.put((ID) id, t);
		}
        
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
    
    Long getNextID() {
    	ID maxId = null;
    	try {
    		maxId = Collections.max(map.keySet());
    		return maxId + 1;
		} catch (NoSuchElementException  e) {
			// TODO: handle exception
			return 1L;
		}    	
    }
}
