package ir.maktabcw19.config;

import ir.maktabcw19.repository.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ApplicationContext {
    private static ApplicationContext applicationContext;
    private ApplicationContext() {
    }
    public static ApplicationContext getInstance() {
        if (applicationContext == null) {
            applicationContext = new ApplicationContext();
        }
        return applicationContext;
    }
    private   EntityManagerFactory entityManagerFactory;
    public EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory= Persistence.
                    createEntityManagerFactory("default");
        }
        return entityManagerFactory;
    }
    private  EntityManager em;
    public EntityManager getEntityManager() {
        if (em == null) {
            em = getEntityManagerFactory().createEntityManager();
        }
        return em;
    }

    private CourseRepository courseRepository;

    public CourseRepository getCourseRepository() {
        if (courseRepository == null) {
            courseRepository = new CourseRepositoryImpl(getEntityManager());
        }
        return courseRepository;
    }

    private EmployeeRepository employeeRepository;

    public EmployeeRepository getEmployeeRepository() {
        if (employeeRepository == null) {
            employeeRepository = new EmployeeRepositoryImpl(getEntityManager());
        }
        return employeeRepository;
    }


    private StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        if (studentRepository == null) {
            studentRepository = new StudentRepositoryImpl(getEntityManager());
        }
        return studentRepository;
    }

    private TeacherRepository teacherRepository;
    public TeacherRepository getTeacherRepository() {
        if (teacherRepository == null) {
            teacherRepository = new TeacherRepositoryImpl(getEntityManager());
        }
        return teacherRepository;
    }

    private LessonRepository lessonRepository;
    public LessonRepository getLessonRepository() {
        if (lessonRepository == null) {
            lessonRepository = new LessonRepositoryImpl(getEntityManager());
        }
        return lessonRepository;
    }
}
