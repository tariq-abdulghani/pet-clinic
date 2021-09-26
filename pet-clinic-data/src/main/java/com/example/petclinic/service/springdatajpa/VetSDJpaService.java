package com.example.petclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Vet;
import com.example.petclinic.repositories.VetRepository;
import com.example.petclinic.service.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
	
	private final VetRepository vetRepository;
	
	
	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet fidById(Long id) {

		return this.vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet t) {
		return this.vetRepository.save(t);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<Vet>();
		vetRepository.findAll().forEach(vets :: add);
		return vets;
	}

	@Override
	public void delete(Vet t) {
		this.vetRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		this.vetRepository.existsById(id);
	}

}
