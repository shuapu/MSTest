package com.apurv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apurv.entity.Person;
import com.apurv.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable("id") Integer id) {
		return ResponseEntity.of(personService.getPerson(id));
	}

}
