package com.example.productconfigapi.model;

public class Product {
	
	private int id;
	private String name;
	
	public Product(int id, String description) {
		super();
		this.id = id;
		this.name = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return name;
	}
	
	public void setDescription(String description) {
		this.name = description;
	}
		

}
