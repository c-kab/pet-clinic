package com.example.petclinic.service;

import com.example.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id) ;
    Vet save (Vet vet) ;
    Set<Vet> findAll() ;
}
