package com.zlab.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zlab.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
