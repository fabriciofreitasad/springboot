package com.api.O298_springBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.O298_springBoot.entities.Order;
import com.api.O298_springBoot.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired //spring vai fazer a injeçao de dependencia automatica
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
