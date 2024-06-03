package com.dpt.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpt.cursospring.entities.OrderItem;
import com.dpt.cursospring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
