package com.fabiankevin.elasticsearchdemo;

import com.fabiankevin.elasticsearchdemo.document.Person;
import com.fabiankevin.elasticsearchdemo.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @GetMapping("/{personId}")
    public Person getById(@PathVariable UUID personId){

        log.trace("Getting person by id={}", personId);
        return personService.findById(personId);
    }

    @GetMapping
    public Page<Person> getListOfPersons(){
        return personService.getPageablePerson();
    }
}
