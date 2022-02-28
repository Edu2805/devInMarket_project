package com.devinhouse.devinmarket.dto;

import com.devinhouse.devinmarket.models.Category;
import com.devinhouse.devinmarket.models.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class DtoProduct {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int estoque;
    private Category category;

    public DtoProduct(Product product) {
        this.id = product.getId();
        this.nome = product.getName();
        this.descricao = product.getDescription();
        this.preco = product.getValue();
        this.estoque = product.getInventory();
        this.category = product.getCategory();
    }

    public DtoProduct() {
    }

    public static List<DtoProduct> convert (List<Product> products){

        return products.stream()
                .map(DtoProduct::new)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
