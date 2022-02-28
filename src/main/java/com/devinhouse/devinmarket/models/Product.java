package com.devinhouse.devinmarket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal value;
    private int inventory;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(Long id, String name, String description, BigDecimal value, int inventory, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
        this.inventory = inventory;
        this.category = category;
    }

    public Product() {
    }

    //construtor para o DTO
    public Product(String nome, String descricao, Category category) {
        this.name = nome;
        this.description = descricao;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
