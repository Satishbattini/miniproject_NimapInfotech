package com.nimap.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nimap.demo.model.Product;
import com.nimap.demo.srevice.ProductService;

@RestController
public class ProductController {

@Autowired
ProductService service;

@PostMapping("/postproduct")
public Product postproduct(@RequestBody Product p) {
	return service.createproduct(p) ;
	
}
@GetMapping("/getdata")
public String getdata(@RequestBody Product p) {
	return service.getdata(p);
	
}

@GetMapping("/getproduct")
public List<Product> getproduct(@RequestBody List<Product> p) {
	return service.getallproduct(p) ;
	
}

@GetMapping("/getproductbyid/{id}")
public Optional<Product> getproductbyid(@PathVariable Long id) {
	return service.getproductbyId(id);
}
@PutMapping("/update/{id}")
public Product productupdatebyId(@PathVariable Long id , @RequestBody Product p) {
	return service.ProductupdateById(id,p);
	
}
@GetMapping("/deleteProductId/{id}")
public String deleteproductById(Long Id) {
	
	return service.deleteProductById(Id);
	
}
}
