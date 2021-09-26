package com.example.petclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repositories.OwnerRepository;
import com.example.petclinic.service.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements  OwnerService{
		
	private final OwnerRepository ownerRepository;
	
	

	public OwnerSDJpaService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Owner fidById(Long id) {
//		Optional<Owner> optionalOwner = ownerRepository.findById(id);
//		if(optionalOwner.isPresent()) {
//			return optionalOwner.get();
//		}else {
//			return null;
//		}
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner t) {
		return ownerRepository.save(t);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		ownerRepository.findAll().forEach(owners :: add);
		return owners;
	}

	@Override
	public void delete(Owner t) {
		ownerRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
	ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}
	


}
