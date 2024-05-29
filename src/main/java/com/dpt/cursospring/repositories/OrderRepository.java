package com.dpt.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpt.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
