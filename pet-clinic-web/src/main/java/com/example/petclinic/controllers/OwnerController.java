package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinic.service.OwnerService;

@RequestMapping("/owner")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	
    public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}


	@RequestMapping({"/", "", "/index", "/index.html"})
    String listOwners(Model model){
    	model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
