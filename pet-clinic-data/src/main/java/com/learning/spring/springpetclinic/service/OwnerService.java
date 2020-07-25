package com.learning.spring.springpetclinic.service;

import com.learning.spring.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
