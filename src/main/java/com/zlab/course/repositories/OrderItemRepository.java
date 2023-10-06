package com.zlab.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zlab.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
