package com.devinhouse.devinmarket.controllers;

import com.devinhouse.devinmarket.dto.DtoProduct;
import com.devinhouse.devinmarket.models.Product;
import com.devinhouse.devinmarket.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll(){

        List<Product> products = productService.findAll();
        return products;
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id){

        return productService.findById(id);
    }

    @PostMapping
    public Product salvar(@RequestBody Product product){

        Product result = productService.add(product);
        return result;
    }

    //Obs: Post está com a limitação do DTO
    @PutMapping(name = "/{id}")
    public Product update(@RequestBody DtoProduct productDto){

        Product result = productService.add(productDto.transformToObject());
        return result;
    }

    @DeleteMapping
    public void delete(@RequestBody Product product){

        productService.delete(product);
    }
}
