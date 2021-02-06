package com.storemanagment.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storemanagment.entities.Product;
import com.storemanagment.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product ajouterproduit(@RequestBody Product product) {
		return service.addProduct(product);
		 }
	@PostMapping("/addProducts")
	public List<Product> ajouterproduits(@RequestBody List<Product> products) {
		return service.addProducts(products);
		 }
	
	@GetMapping("/getProducts")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@GetMapping("/getProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return service.getProductById(id);
		 	
	}
	@GetMapping("/getProducts/{name}")
	public List<Product> getProducts(@PathVariable String name) {
		return service.getProductByName(name);
		 	
	}
	
	@GetMapping("/getProductPrice/{price}")
	public List<Product> getProductstock(@PathVariable float price) {
	   	return service.getProductByPrice(price);
		 	
	}
	
	@GetMapping("/getProductStock/{stock}")
	public List<Product> getProductstock(@PathVariable int stock) {
		return service.getProductByStock(stock);
		 	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
		 	
	}
	
	
	
	
	
}

