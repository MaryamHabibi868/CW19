package ir.maktabcw19.service.base;

import ir.maktabcw19.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService
        <T extends BaseEntity,
                ID extends Serializable> {


    T save(T entity);

    void delete(T entity);

    void deleteById(ID id);

    List<T> findAll();

    T findById(ID id);

    Boolean existsById(ID id);

}
