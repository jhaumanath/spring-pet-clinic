package com.learning.spring.springpetclinic.service;

import com.learning.spring.springpetclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
