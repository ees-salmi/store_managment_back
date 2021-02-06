package com.storemanagment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue
	private int    id;
	private String name;
	private float  price;
	private int    stock;
	private String description;
	private String productionDate;
	private String expirationDate;
	


	public Product(int id, String name,float  price,int stock, String description, String productionDate, String expirationDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.description = description;
		this.productionDate = productionDate;
		this.expirationDate = expirationDate;
	}
	
	
	public Product() {
		
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProductionDate() {
		return productionDate;
	}


	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}


	public String getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	

	

}
