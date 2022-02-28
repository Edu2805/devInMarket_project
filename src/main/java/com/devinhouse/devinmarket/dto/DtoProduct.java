package com.devinhouse.devinmarket.dto;

import com.devinhouse.devinmarket.models.Category;
import com.devinhouse.devinmarket.models.Product;

public class DtoProduct {

    private String nome;
    private String descricao;
    private Category category;

    public DtoProduct(String nome, String descricao, Category category) {
        this.nome = nome;
        this.descricao = descricao;
        this.category = category;
    }

    public DtoProduct() {
    }

    public Product transformToObject(){
        return new Product(nome, descricao, category);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
