package com.api.O298_springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.O298_springBoot.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
