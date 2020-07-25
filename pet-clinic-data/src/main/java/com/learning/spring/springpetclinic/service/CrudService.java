package com.learning.spring.springpetclinic.service;

import com.learning.spring.springpetclinic.model.Owner;

import java.util.Set;

public interface CrudService<T,Long> {

    T findById(Long Id);
    T save(T object);
    Set<T> findAll();
    void delete(T object);
    void deleteById(Long id);
}
