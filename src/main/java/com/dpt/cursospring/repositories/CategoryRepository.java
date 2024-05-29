package com.dpt.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpt.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
