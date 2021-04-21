package com.carlosg.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosg.application.entities.Product;
import com.carlosg.application.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById( Long id ) {
		Optional<Product> user = productRepository.findById(id);
		return user.get();
	}
}
