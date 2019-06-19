package pl.spring.petclinic.services;

import java.util.Set;

/**
 * Created by A.Wójcik on 19 06 2019.
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);



}
