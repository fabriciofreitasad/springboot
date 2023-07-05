package com.api.O298_springBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.O298_springBoot.entities.Product;
import com.api.O298_springBoot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired //spring vai fazer a injeçao de dependencia automatica
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
