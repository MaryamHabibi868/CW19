package ir.maktabcw19.service;


import ir.maktabcw19.repository.CourseRepository;
import ir.maktabcw19.repository.StudentRepository;
import ir.maktabcw19.repository.StudentRepositoryImpl;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StudentServiceImplTest {


    @Test
    void showProfile() {
        StudentRepository sr = mock(StudentRepository.class);
        CourseService cr = mock(CourseService.class);
        StudentService sc = new StudentServiceImpl(sr, cr);

        when(sr.findById(any())).
                thenReturn(Optional.empty());

        try {
            sc.showProfile(1);
            Assertions.fail("Should throw exception");
        }
        catch (RuntimeException e) {
            Assertions.assertEquals(e.getClass(), RuntimeException.class);
            Assertions.assertEquals(e.getMessage(), " Student not found");
        }
    }
}