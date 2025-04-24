package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;

import java.util.Set;

public interface CourseRepository {

    void create(Course course);

    void update(Course course);

    void delete(Course course);

    Course findById(int id);

    Course findByNumberCourse(int numberCourse);

    Set<Course> findAll();

    Boolean containsCourse(Course course);

}
