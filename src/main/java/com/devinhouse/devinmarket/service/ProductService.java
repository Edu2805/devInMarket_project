package com.devinhouse.devinmarket.service;

import com.devinhouse.devinmarket.models.Product;
import com.devinhouse.devinmarket.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final List<Product> products = new ArrayList<>();

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return (List<Product>) productRepository.findAll();
    }

    public Product findById (Long id){
        Product result = productRepository.findById(id).get();

        return result;
    }

    public Product add(Product product){

        Product result = productRepository.save(product);
        return result;
    }

    public Product update(Product product){

        Product result = productRepository.save(product);
        return result;
    }

    public void delete(Product product){
        productRepository.delete(product);
    }

}
