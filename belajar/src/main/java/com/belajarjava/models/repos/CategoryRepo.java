package com.belajarjava.models.repos;

import com.belajarjava.models.entities.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
