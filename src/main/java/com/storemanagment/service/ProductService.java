package com.storemanagment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storemanagment.entities.Product;
import com.storemanagment.repository.Repository;

@SuppressWarnings("unchecked")
@Service
public class ProductService {
	
	@Autowired
	private Repository repository;
	
	public List<Product>  getAllProducts(){
		
		List<Product> products = new ArrayList<>();
		
		repository.findAll().forEach(products::add);
		
		return products;
		
	}
	
	public List<Product> getProducts(){
		
		return (List<Product>)repository.findAll();
	}
	
	public Product addProduct(Product produit) {
		
		return repository.save(produit);
	}
	
	public Optional<Product> getProductById(int id) {
		
		return repository.findById(id);	
	}
	
	public List<Product> getProductByPrice(float price) {
		
		return repository.findByPrice(price);	
	}
	
	public List<Product> getProductByStock(int stock) {
		
		return repository.findByStock(stock);	
	}
	
	
	public List<Product> addProducts(List<Product> products) {
		
		return (List<Product>) repository.saveAll(products);
	}
	

	public List<Product> getProductByName(String name) {
		
		return   repository.findByName(name);
	}
	
	
	public String deleteProduct(int id) {
		
		repository.deleteById(id);
		
		return "product removed succecfuly"+id;
	}
	// pour modifier le produit donnéé la méthode save peut modifier le produit si le trouve
	public Product updateProduct(Product product) {
		
		   return repository.save(product);
		
	}

	
	

}
