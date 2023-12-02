package com.apurv.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apurv.entity.Person;
import com.apurv.repository.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	public Optional<Person> getPerson(Integer personId) {
		return personRepo.findById(personId);

	}

}
