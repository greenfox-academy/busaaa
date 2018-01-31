package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Integer>{

}
