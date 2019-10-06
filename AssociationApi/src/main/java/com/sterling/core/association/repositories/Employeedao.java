package com.sterling.core.association.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sterling.core.association.entity.Employee;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {
 
}
