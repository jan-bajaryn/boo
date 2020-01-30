package com.ang.boo.repos;

import com.ang.boo.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, String> {
}
