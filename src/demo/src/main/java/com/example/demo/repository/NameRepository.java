package com.example.demo.repository;

import com.example.demo.entity.Name;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends CrudRepository<Name, Integer> {
    
}