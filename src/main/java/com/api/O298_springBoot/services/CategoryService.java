package com.api.O298_springBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.O298_springBoot.entities.Category;
import com.api.O298_springBoot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired //spring vai fazer a injeçao de dependencia automatica
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
