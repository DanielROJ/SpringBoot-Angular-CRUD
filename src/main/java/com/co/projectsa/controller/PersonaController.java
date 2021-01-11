package com.co.projectsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.projectsa.model.Persona;
import com.co.projectsa.repository.PersonaRepository;

@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired 
	private PersonaRepository repPersona;
	
	
	@GetMapping("/persona")
	public Persona setNewPersona(@RequestBody Persona persona) {
		return repPersona.save(persona);
	}
	
	
	
	
	
}
