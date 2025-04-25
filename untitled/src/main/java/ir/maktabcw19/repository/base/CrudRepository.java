package ir.maktabcw19.repository.base;

import ir.maktabcw19.entity.BaseEntity;
import ir.maktabcw19.entity.Course;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CrudRepository
        <T extends BaseEntity,
                ID extends Serializable> {

    T save(T entity);

    void delete(T entity);

    void deleteById(ID id);

    List<T> findAll();

    Optional<T> findById(ID id);

    Boolean existsById(ID id);

    void beginTransaction();

    void commitTransaction();
}
