package ir.maktabcw19.service;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.repository.CourseRepository;
import ir.maktabcw19.service.base.BaseServiceImpl;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl
        extends BaseServiceImpl<Course, Integer, CourseRepository>
        implements CourseService {

    private final LessonService lessonService;

    public CourseServiceImpl(CourseRepository repository, LessonService lessonService) {
        super(repository);
        this.lessonService = lessonService;
    }

    @Override
    public Course findByNumberCourse(Integer number) {
        Optional<Course> find = repository.findByNumberCourse(number);
        if (find.isPresent()) {
            return find.get();
        }
        throw new RuntimeException("Course not found");
    }

    @Override
    public List<Lesson> findLessonByCourse(Integer numberCourse) {
        lessonService.findAll()
        return List.of();
    }
}
