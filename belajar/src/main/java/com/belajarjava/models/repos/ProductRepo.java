package com.belajarjava.models.repos;

import java.util.List;

import javax.websocket.server.PathParam;

import com.belajarjava.models.entities.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
    // List<Product> findByNameContains(String name);

    // @Query("SELECT p FROM Product p WHERE p.name = :name")
    // public Product findByName(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.name LIKE :name")
    public List<Product> findByNameLike(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.category.name LIKE :categoryName")
    public List<Product> findByCategory(@PathParam("categoryName") String categoryName);

}
