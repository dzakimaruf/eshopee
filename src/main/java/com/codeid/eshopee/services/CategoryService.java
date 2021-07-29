package com.codeid.eshopee.services;

import java.util.List;
import java.util.Optional;

import com.codeid.eshopee.model.Category;


public interface CategoryService {
    //findall
    List<Category> findAllCategory();
    //insert object category
    Category addCategory(Category category);
    //cari data category yg sesuai id
    Optional <Category> findCategoryById(Long id);
    //delete
    void deleteCategoryById(Long id);

}
