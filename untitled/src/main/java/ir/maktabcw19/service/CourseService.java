package ir.maktabcw19.service;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.service.base.BaseService;

import java.util.List;
import java.util.Optional;

public interface CourseService
        extends BaseService<Course, Integer> {

    Optional<Course> findByNumberCourse(Integer number);

    List<Lesson> findLessonByCourse (Integer numberCourse);
}
