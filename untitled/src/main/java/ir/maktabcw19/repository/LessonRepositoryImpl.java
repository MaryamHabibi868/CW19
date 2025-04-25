package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.entity.Student;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;

public class LessonRepositoryImpl
extends SimpleJpaRepository<Lesson, Integer>
implements LessonRepository {

    public LessonRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Lesson> getDomainClass() {
        return Lesson.class;
    }
}
