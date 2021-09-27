package com.example.petclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.example.petclinic.model.Owner;
import com.example.petclinic.service.OwnerService;


@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Long, Owner> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return  this.map
				.values()
				.stream()
				.findFirst()
				.filter(owner-> owner.getLastName().equalsIgnoreCase(lastName))
				.get();
		
	}
}
