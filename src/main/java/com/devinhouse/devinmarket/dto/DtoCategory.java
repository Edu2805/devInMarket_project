package com.devinhouse.devinmarket.dto;

import com.devinhouse.devinmarket.models.Category;

public class DtoCategory {

    private String name;

    public DtoCategory(String name) {
        this.name = name;
    }

    public DtoCategory() {
    }

    public Category categoryDto(){
        return new Category(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
