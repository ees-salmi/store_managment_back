package com.storemanagment.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.storemanagment.entities.Product;

public interface Repository extends CrudRepository<Product, Integer>{

	public List<Product> findByName(String name);
	public List<Product> findByPrice(float price);
	public List<Product> findByStock(int stock);

}
