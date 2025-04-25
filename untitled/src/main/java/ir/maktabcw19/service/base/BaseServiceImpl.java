package ir.maktabcw19.service.base;

import ir.maktabcw19.entity.BaseEntity;
import ir.maktabcw19.repository.base.CrudRepository;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
public class BaseServiceImpl
        <T extends BaseEntity,
        ID extends Serializable,
        R extends CrudRepository<T, ID>>
        implements BaseService<T, ID> {


    protected final R repository;


    @Override
    public T save(T entity) {
        repository.beginTransaction();
        entity = repository.save(entity);
        repository.commitTransaction();
        return entity;
    }


    @Override
    public void delete(T entity) {
        repository.beginTransaction();
        repository.delete(entity);
        repository.commitTransaction();
    }

    @Override
    public void deleteById(ID id) {
        repository.beginTransaction();
        repository.deleteById(id);
        repository.commitTransaction();
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }


    @Override
    public T findById(ID id) {
        Optional<T> find = repository.findById(id);
        if (find.isPresent()) {
            return find.get();
        }
        throw new RuntimeException("this id not found");
    }


    @Override
    public Boolean existsById(ID id) {
        return repository.existsById(id);
    }

}
