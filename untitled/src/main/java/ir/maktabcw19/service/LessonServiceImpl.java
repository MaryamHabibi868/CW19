package ir.maktabcw19.service;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.entity.Student;
import ir.maktabcw19.repository.CourseRepository;
import ir.maktabcw19.repository.LessonRepository;
import ir.maktabcw19.service.base.BaseServiceImpl;

import java.util.List;
import java.util.Optional;

public class LessonServiceImpl
        extends BaseServiceImpl<Lesson, Integer, LessonRepository>
        implements LessonService {

    private CourseService courseService;

    public LessonServiceImpl(LessonRepository repository) {
        super(repository);
    }
   /* public void setGrade(){
    }*/

    @Override
    public List<Lesson> showLessonList(Integer numberCourse) {
        return repository.findAll();
    }

}
