package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Lesson;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.Optional;
import java.util.Set;

public class CourseRepositoryImpl
        extends SimpleJpaRepository<Course, Integer>
        implements CourseRepository {


    public CourseRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Course> getDomainClass() {
        return Course.class;
    }

    @Override
    public Optional<Course> findByNumberCourse(Integer number) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> root = cq.from(Course.class);
        cq.select(root).where(cb.equal(root.get("numberCourse"), number));
        return Optional.ofNullable(entityManager.createQuery(cq).getSingleResult());
    }


}
