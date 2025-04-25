package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;

public class CourseRepositoryImpl
        extends SimpleJpaRepository<Course, Integer>
        implements CourseRepository {


    public CourseRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Course> getDomainClass() {
        return Course.class;
    }
}
