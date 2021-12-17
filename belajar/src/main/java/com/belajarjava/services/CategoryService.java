package com.belajarjava.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.belajarjava.models.entities.Category;
import com.belajarjava.models.repos.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category create(Category category) {
        return categoryRepo.save(category);
    }

    public Category findOne(Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (!category.isPresent()) {
            return null;
        }
        return category.get();
    }

    public Iterable<Category> findAll() {
        return categoryRepo.findAll();
    }

    public void removeOne(long id) {
        categoryRepo.deleteById(id);
    }

}
