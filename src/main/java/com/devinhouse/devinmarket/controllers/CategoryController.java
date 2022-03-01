package com.devinhouse.devinmarket.controllers;


import com.devinhouse.devinmarket.dto.DtoCategory;
import com.devinhouse.devinmarket.dto.DtoClient;
import com.devinhouse.devinmarket.models.Category;
import com.devinhouse.devinmarket.models.Client;
import com.devinhouse.devinmarket.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> findAll(){

        List<Category> category = categoryService.findAll();
        return category;
    }

    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable Long id){

        return categoryService.findById(id);
    }


    @PostMapping
    public Category salvar(@RequestBody Category category){

        Category result = categoryService.add(category);
        return result;
    }

    //Obs: Post está com a limitação do DTO
    @PutMapping(value = "/{id}")
    public Category update(@RequestBody DtoCategory categoryDto){

        Category result = categoryService.update(categoryDto.categoryDto());
        return result;
    }

    @DeleteMapping
    public void delete(@RequestBody Category category){

        categoryService.delete(category);
    }

}
