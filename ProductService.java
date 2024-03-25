package com.nimap.demo.srevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.demo.model.Product;
import com.nimap.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;


	
	public Product createproduct(Product p) {
		
		return repo.save(p);
	}
	public String getdata(Product p) {
		repo.save(p);
		return "get data success";
	}
	public List<Product> getallproduct(List<Product> p) {
		
		return repo.findAll();
	}

	public Optional<Product> getproductbyId(Long id) {
		
		return repo.findById(id);
	}

	public Product ProductupdateById(Long id, Product p) {
		Optional<Product> updateProduct= repo.findById(id);
		if(updateProduct != null) {
			p.setId(id);
			Product std=repo.save(p);
			return std;
			}
		return null;
	}
	public String deleteProductById(Long id) {
	
		return "data delete successfully";
	}

}
