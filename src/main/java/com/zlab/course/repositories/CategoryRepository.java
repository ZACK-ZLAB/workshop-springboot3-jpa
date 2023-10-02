package com.zlab.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zlab.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
