package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Student;
import ir.maktabcw19.entity.Teacher;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;

public class TeacherRepositoryImpl
extends SimpleJpaRepository<Teacher, Integer>
implements TeacherRepository {

    public TeacherRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Teacher> getDomainClass() {
        return Teacher.class;
    }
}
