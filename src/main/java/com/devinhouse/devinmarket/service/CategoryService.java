package com.devinhouse.devinmarket.service;

import com.devinhouse.devinmarket.models.Category;
import com.devinhouse.devinmarket.models.Client;
import com.devinhouse.devinmarket.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return (List<Category>) categoryRepository.findAll();
    }

    public Category findById (Long id){
        Category result = categoryRepository.findById(id).get();

        return result;
    }

    public Category add(Category category){

        Category result = categoryRepository.save(category);
        return result;
    }

    public Category update(Category category){

        Category result = categoryRepository.save(category);
        return result;
    }

    public void delete(Category category){
        categoryRepository.delete(category);
    }
}
