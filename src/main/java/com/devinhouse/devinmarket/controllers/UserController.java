package com.devinhouse.devinmarket.controllers;

import com.devinhouse.devinmarket.dto.DtoProduct;
import com.devinhouse.devinmarket.models.Product;
import com.devinhouse.devinmarket.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class UserController {

    //video 38:49
    private ProductService productService;

    public UserController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<DtoProduct> findAll(){

        List<Product> products = productService.findAll();
        return DtoProduct.convert(products);
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

    @PutMapping
    public Product update(@RequestBody Product product){
        Product result = productService.update(product);
        return result;
    }

    @DeleteMapping
    public void delete(@RequestBody Product product){

        productService.delete(product);
    }

}
