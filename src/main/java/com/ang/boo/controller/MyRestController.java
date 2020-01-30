package com.ang.boo.controller;

import com.ang.boo.domain.Person;
import com.ang.boo.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

    private final PersonRepo personRepo;

    @Autowired
    public MyRestController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @GetMapping("add_person")
    public boolean addPerson(@RequestParam(name = "name") String name,
                             @RequestParam(name = "surname") String surname) {

        personRepo.save(Person.builder().name(name).surname(surname).build());
        return true;
    }

    @GetMapping("get_all")
    public List<Person> getAll() {
        return (List<Person>) personRepo.findAll();
    }
}
