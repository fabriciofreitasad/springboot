package com.api.O298_springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.O298_springBoot.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
