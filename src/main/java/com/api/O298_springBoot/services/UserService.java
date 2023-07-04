package com.api.O298_springBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.O298_springBoot.entities.User;
import com.api.O298_springBoot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired //spring vai fazer a injeçao de dependencia automatica
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
