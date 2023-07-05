package com.api.O298_springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.O298_springBoot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
