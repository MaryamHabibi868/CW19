package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Person;
import ir.maktabcw19.repository.base.CrudRepository;

import java.util.Optional;

public interface PersonRepository
        extends CrudRepository<Person, Integer> {

    Optional<Person> findByUsername(String username);
}
