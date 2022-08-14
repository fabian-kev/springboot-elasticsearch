package com.fabiankevin.elasticsearchdemo.service;

import com.fabiankevin.elasticsearchdemo.document.Person;
import com.fabiankevin.elasticsearchdemo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person findById(UUID id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Person with id=%s does not exist", id)));
    }
}
