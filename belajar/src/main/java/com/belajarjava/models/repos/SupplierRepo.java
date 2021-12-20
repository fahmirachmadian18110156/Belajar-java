package com.belajarjava.models.repos;

import java.util.List;

import com.belajarjava.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {

    List<Supplier> findByNameContains(String name);

    List<Supplier> findByNameContainsAndAddressContains(String name, String address);

}
