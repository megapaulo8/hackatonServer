package com.hackaton.windev.controllers;

import com.hackaton.windev.entities.Property;
import com.hackaton.windev.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private PropertyRepository repository;

	@GetMapping("/person")
	public @ResponseBody
	Iterable<Property> showPerson() {
		return repository.findAll();
	}
}
