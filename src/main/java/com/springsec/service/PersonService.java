package com.springsec.service;

import com.springsec.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    public Optional<Person> findById (){

        Optional<Person> person = Optional.of(new Person(1L, "Santiago", "Perez", 10000.0));

        return person;
    }

    public List<Person> findAll() {
        return List.of(
                new Person(1L, "Santiago", "Perez", 10000.0),
                new Person(2L, "Anyi", "Hoyos", 20000.0),
                new Person(3L, "Andrea", "Calle", 150000.0));
    }

}
