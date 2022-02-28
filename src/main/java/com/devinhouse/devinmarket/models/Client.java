package com.devinhouse.devinmarket.models;

import com.devinhouse.devinmarket.dto.DtoClient;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    @Column(name = "data_nascimento")
    private String birthDate;

    @ManyToMany
    @JoinTable(name = "produto_client", joinColumns = {@JoinColumn(name = "id_client")}, inverseJoinColumns = {@JoinColumn(name = "id_product")})
    Set<Product> product;

    public Client(Long id, String name, String cpf, String birthDate, Set<Product> product) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.product = product;
    }

    public Client() {
    }

    //Construtor do DTO

    public Client(String name, String birthDate, Set<Product> product) {
        this.name = name;
        this.birthDate = birthDate;
        this.product = product;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
