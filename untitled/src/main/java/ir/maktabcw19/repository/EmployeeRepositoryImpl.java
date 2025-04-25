package ir.maktabcw19.repository;

import ir.maktabcw19.entity.Employee;
import ir.maktabcw19.entity.Person;
import ir.maktabcw19.repository.base.SimpleJpaRepository;
import jakarta.persistence.EntityManager;

public class EmployeeRepositoryImpl
    extends SimpleJpaRepository<Employee, Integer>
        implements EmployeeRepository {


    public EmployeeRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Employee> getDomainClass() {
        return Employee.class;
    }
}
