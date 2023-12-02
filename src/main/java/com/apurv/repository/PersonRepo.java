package com.apurv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apurv.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
