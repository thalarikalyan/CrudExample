package com.springboot.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.model.crudmodel;

@Repository
public interface crudrepo extends JpaRepository<crudmodel, Integer> {

}
