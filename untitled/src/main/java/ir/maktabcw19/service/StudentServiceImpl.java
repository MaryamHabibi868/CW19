package ir.maktabcw19.service;

import ir.maktabcw19.config.ApplicationContext;
import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.entity.Student;
import ir.maktabcw19.repository.StudentRepository;
import ir.maktabcw19.service.base.BaseServiceImpl;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StudentServiceImpl extends BaseServiceImpl<Student, Integer, StudentRepository> implements StudentService {
    public StudentServiceImpl(StudentRepository repository, CourseService courseService) {
        super(repository);
        this.courseService = courseService;
    }

    CourseService courseService;
    EntityManager em = ApplicationContext.getInstance().getEntityManager();

//    public List<Lesson> showAllLessonsByStudentId(Integer studentId, Integer numberOfCourse) {
//        List<Lesson> lessons = em.createQuery("from Lesson l join Course c " +
//                        "on l.course.id=c.id join c.students s  " +
//                        "where s.id=:studentId and l.course.numberCourse=:numberOfCourse"
//                , Lesson.class).setParameter("studentId", studentId).setParameter("numberOfCourse", numberOfCourse).getResultList();
//        return lessons;
//    }

    public Student showProfile(Integer studentId) {
        Student student = em.find(Student.class, studentId);

        Student student1 = new Student();
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setCourses(student.getCourses());
        return student1;
    }

    public boolean addUnit(List<Lesson> lessons, Integer studentId, int numberCourse) {
        Optional<Student> byId = repository.findById(studentId);
        if (byId.isPresent()) {
            Student student = byId.get();
            Set<Course> courses = student.getCourses();
            Optional<Course> byNumberCourse = courseService.findByNumberCourse(numberCourse);
            if (byNumberCourse.isPresent()) {
            }
        }
        return false;
    }

    public double countScore(Course course, Integer studentId) {
        double score = 0;
        int count = 0;
//        Set<Lesson> lessons = course.getLessons();
//        for (Lesson lesson : lessons) {
//            score += lesson.getGrade() * lesson.getUnit();
//            count += lesson.getUnit();
//        }
//        return score / count;
        return score;
    }
}
