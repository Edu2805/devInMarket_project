package com.devinhouse.devinmarket.repositories;

import com.devinhouse.devinmarket.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
