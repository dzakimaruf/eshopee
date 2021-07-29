package com.codeid.eshopee.repository;


import com.codeid.eshopee.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

//long diambil dari model
public interface CategoryRepository extends JpaRepository<Category,Long>{
    
}
