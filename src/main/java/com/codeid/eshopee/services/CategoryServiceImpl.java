package com.codeid.eshopee.services;

import java.util.List;
import java.util.Optional;

import com.codeid.eshopee.model.Category;
import com.codeid.eshopee.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        
        return categoryRepository.save(category);
    }

    @Override
    public Optional<Category> findCategoryById(Long id) {
        
        return categoryRepository.findById(id);
    }
    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
        
    }
    
}
