package com.fabiankevin.elasticsearchdemo.repository;

import com.fabiankevin.elasticsearchdemo.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, UUID> {
}
