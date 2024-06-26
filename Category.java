package com.nimap.demo.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
private List<Product> product;
	public Category(Long id, String name,List< Product> product) {
		
		this.id = id;
		this.name = name;
		this.product = product;
	}
	public Category() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "CategoryController [id=" + id + ", name=" + name + ", product=" + product + "]";
	}
	
}
