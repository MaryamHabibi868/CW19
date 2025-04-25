package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.repository.base.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface CourseRepository
        extends CrudRepository<Course, Integer> {

    Optional<Course> findByNumberCourse(Integer number);

}
