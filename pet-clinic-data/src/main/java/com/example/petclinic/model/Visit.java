package com.example.petclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
	
	private LocalDate vistDate;
	private String description;
	private Pet pet;
	
	
	public LocalDate getVistDate() {
		return vistDate;
	}
	public void setVistDate(LocalDate vistDate) {
		this.vistDate = vistDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
}
