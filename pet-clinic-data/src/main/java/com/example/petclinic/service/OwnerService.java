package com.example.petclinic.service;

import com.example.petclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName) ;

    }
