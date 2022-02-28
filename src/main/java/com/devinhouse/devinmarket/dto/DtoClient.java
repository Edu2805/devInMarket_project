package com.devinhouse.devinmarket.dto;

import com.devinhouse.devinmarket.models.Client;
import com.devinhouse.devinmarket.models.Product;
import java.time.LocalDate;
import java.util.Set;

public class DtoClient {

    private String name;
    private String birthDate;
    Set<Product> product;

    public DtoClient(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public DtoClient() {
    }

    public Client clientDto(){
        return new Client(name, birthDate, product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}
