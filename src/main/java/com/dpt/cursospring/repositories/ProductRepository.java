package com.dpt.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpt.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
