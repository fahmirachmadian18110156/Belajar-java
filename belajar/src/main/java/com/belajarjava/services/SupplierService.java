package com.belajarjava.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.belajarjava.models.entities.Supplier;
import com.belajarjava.models.repos.SupplierRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    public Supplier create(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepo.findAll();
    }

    public Supplier findOne(long id) {
        Optional<Supplier> supplier = supplierRepo.findById(id);
        if (!supplier.isPresent()) {
            return null;
        }
        return supplier.get();
    }

    public void removeOne(long id) {
        supplierRepo.deleteById(id);
    }

}
