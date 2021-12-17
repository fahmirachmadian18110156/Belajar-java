package com.belajarjava.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.belajarjava.models.entities.Product;
import com.belajarjava.models.entities.Supplier;
import com.belajarjava.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }

    public void addSupplier(Supplier supplier, Long productId) {
        Product product = findOne(productId);
        if (product == null) {
            throw new RuntimeException("Product dengan id " + productId + " Tidak dapat ditemukan");
        }
        product.getSuppliers().add(supplier);
        save(product);
    }
}
