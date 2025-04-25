package ir.maktabcw19.service;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.entity.Student;
import ir.maktabcw19.service.base.BaseService;

import java.util.List;

public interface LessonService
        extends BaseService<Lesson, Integer> {

    List<Lesson> showLessonList(Integer numberCourse);
}