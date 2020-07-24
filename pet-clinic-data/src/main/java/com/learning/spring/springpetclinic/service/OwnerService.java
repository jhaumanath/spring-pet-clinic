package com.learning.spring.springpetclinic.service;

import com.learning.spring.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
