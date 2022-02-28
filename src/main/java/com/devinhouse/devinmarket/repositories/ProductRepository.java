package com.devinhouse.devinmarket.repositories;

import com.devinhouse.devinmarket.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
