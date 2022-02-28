package com.devinhouse.devinmarket.dto;

import com.devinhouse.devinmarket.models.Client;
import com.devinhouse.devinmarket.models.Product;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Set;

public class DtoClient {

    private String name;
    @Column(name = "data_nascimento")
    private LocalDate birthDate;
    Set<Product> product;

    public DtoClient(String name, LocalDate birthDate) {
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
