package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {

    @RequestMapping({"/", "/index","/index.html"})
    String listOwners(){
        return "owners/index";
    }
}