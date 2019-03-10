package com.hackaton.windev.controllers;

import com.hackaton.windev.entities.Person;
import com.hackaton.windev.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class TestController {

	@Autowired
	private PersonRepository repository;

	@GetMapping("/get/people")
	public @ResponseBody
	Iterable<Person> getPeople() {
		return repository.findAll();
	}

	@GetMapping("/get/person/{id}")
	public @ResponseBody
	Optional<Person> getPersonById(@PathVariable Long id) {
		return repository.findById(id);
	}

	@GetMapping("/get/person/{id}/fullname")
	public @ResponseBody
	String getPersonFullNameById(@PathVariable Long id) {
		Optional<Person> getTest = repository.findById(id);

		Person test = null;
		if (getTest.isPresent()) {
			test = getTest.get();
		} else {
			return "not found";
		}

		return test.getFullName();
	}


	@PostMapping("/save/person")
	public @ResponseBody
	String savePerson(@RequestBody Person person) {
		try {
			this.repository.save(person);
		} catch (Exception exception) {
			return exception.getMessage();
		}
		return "success";
	}
}
