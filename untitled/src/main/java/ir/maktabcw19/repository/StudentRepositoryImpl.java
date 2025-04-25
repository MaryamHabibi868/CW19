package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Student;
import ir.maktabcw19.repository.base.CrudRepository;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;

import java.util.Optional;

public class StudentRepositoryImpl
extends SimpleJpaRepository<Student, Integer>
implements StudentRepository {

    public StudentRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Student> getDomainClass() {
        return Student.class;
    }
}
