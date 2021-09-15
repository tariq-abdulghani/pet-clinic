package com.example.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.map.OwnerServiceMap;
import com.example.petclinic.map.PetServiceMap;
import com.example.petclinic.map.VetServiceMap;
import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Vet;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final VetServiceMap vetServiceMap;
	private final OwnerServiceMap ownerServiceMap;
	private final PetServiceMap petServiceMap;
	
	
	

	public DataLoader(VetServiceMap vetServiceMap, OwnerServiceMap ownerServiceMap, PetServiceMap petServiceMap) {
		super();
		this.vetServiceMap = vetServiceMap;
		this.ownerServiceMap = ownerServiceMap;
		this.petServiceMap = petServiceMap;
	}



//	public DataLoader() {
//		this.vetServiceMap = new VetServiceMap();
//		this.ownerServiceMap = new OwnerServiceMap();
//		this.petServiceMap = new PetServiceMap();
//	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println(".....adding owners data.....");
		Owner ownerAOwner = new Owner();
		ownerAOwner.setId(1L);
		ownerAOwner.setFirstName("Asd");
		ownerAOwner.setLastName("lsd");
		
		ownerServiceMap.save(ownerAOwner);
		
		Owner ownerBOwner = new Owner();
		ownerBOwner.setId(1L);
		ownerBOwner.setFirstName("Asd");
		ownerBOwner.setLastName("lsd");
		ownerServiceMap.save(ownerBOwner);
		
		
		System.out.println(".....adding vet data.....");
		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("vet 1");
		vet.setLastName("last 1");
		vetServiceMap.save(vet);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("vet 2");
		vet2.setLastName("last 2");
		vetServiceMap.save(vet2);
		
		System.out.println(".....adding Pet data.....");
		Pet pet1 = new Pet();
		pet1.setId(1L);
		pet1.setOwner(ownerAOwner);
		PetType typea = new PetType(); 
		typea.setName("petA"); 
		pet1.setPetType(typea);
		petServiceMap.save(pet1);
		
		Pet pet2 = new Pet();
		pet2.setId(1L);
		pet2.setOwner(ownerAOwner);
		pet2.setPetType(typea);
		petServiceMap.save(pet2);
	}

}
