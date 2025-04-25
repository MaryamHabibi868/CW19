package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Course;
import ir.maktabcw19.entity.Person;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.query.criteria.spi.CriteriaBuilderExtension;

import java.util.Optional;

public class PersonRepositoryImpl
        extends SimpleJpaRepository<Person, Integer>
        implements PersonRepository{


    public PersonRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Person> getDomainClass() {
        return Person.class;
    }

    @Override
    public Optional<Person> findByUsername(String username) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> cq = cb.createQuery(Person.class);
        Root<Person> root = cq.from(Person.class);
        cq.select(root);
        cq.where(cb.equal(root.get("userName"), username)); //TODO Question
        return Optional.ofNullable(entityManager.createQuery(cq).getSingleResult());
    }
}
