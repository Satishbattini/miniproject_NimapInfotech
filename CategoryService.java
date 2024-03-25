package com.nimap.demo.srevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.demo.model.Category;
import com.nimap.demo.repository.CategoryRepository;
@Service
public class CategoryService {
@Autowired
CategoryRepository repository;

public String createcategory(Category c) {
	repository.save(c);
	return "post all data";
}

public Category getcategory(Category c) {
	
	return repository.save(c);
}

public List<Category> getallCategory(List<Category> c) {
	
	return repository.findAll();
}

public Optional<Category> getallCategorybyId(Long id) {
	
	return repository.findById(id);
}

public Category updateCatogiryById(Long id, Category c) {
	Optional<Category> updateCategory= repository.findById(id);
	if(updateCategory != null) {
		c.setId(id);
		Category cat=repository.save(c);
		return cat;
		}
	return null;
}

public String deleteCatogiryById(Long id) {
	
	return "delete successfully";
}


}
