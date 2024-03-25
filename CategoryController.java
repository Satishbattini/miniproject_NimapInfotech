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

import com.nimap.demo.model.Category;
import com.nimap.demo.srevice.CategoryService;

@RestController
public class CategoryController {

@Autowired
CategoryService service;

@PostMapping("/postcategory")
public String postcategory(@RequestBody Category c) {
	return service.createcategory(c) ;
	
}

@GetMapping("/getcategory")
public Category getcategory(@RequestBody Category c) {
	return service.getcategory(c) ;
	
}
@GetMapping("/getCategoryall")
public List<Category> getCategory(@RequestBody List<Category> c) {
	return service.getallCategory(c) ;
	
}

@GetMapping("/getCategoryid/{id}")
public Optional<Category> getCategorybyid(@PathVariable Long id) {
	return service.getallCategorybyId(id);
}
@PutMapping("/updatecatogiry/{id}")
public Category updatecatogirybyId(@PathVariable Long id , @RequestBody Category c) {
	return service.updateCatogiryById(id,c);
	
}
@GetMapping("/deleteCatogiryId/{id}")
public String deleteById(Long Id) {
	
	return service.deleteCatogiryById(Id);
	
}
	
}
