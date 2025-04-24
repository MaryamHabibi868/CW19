package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;

import java.util.Set;

public class courseRepositoryImp implements CourseRepository{


    @Override
    public void create(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Course course) {

    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course findByNumberCourse(int numberCourse) {
        return null;
    }

    @Override
    public Set<Course> findAll() {
        return Set.of();
    }

    @Override
    public Boolean containsCourse(Course course) {
        return null;
    }
}
