package com.devinhouse.devinmarket.controllers;

import com.devinhouse.devinmarket.dto.DtoClient;
import com.devinhouse.devinmarket.dto.DtoProduct;
import com.devinhouse.devinmarket.models.Client;
import com.devinhouse.devinmarket.models.Product;
import com.devinhouse.devinmarket.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClientController {

   ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> findAll(){

        List<Client> clients = clientService.findAll();
        return clients;
    }

    @GetMapping(value = "/{id}")
    public Client findById(@PathVariable Long id){

        return clientService.findById(id);
    }

    @PostMapping
    public Client salvar(@RequestBody Client client){

        Client result = clientService.add(client);
        return result;
    }

    //Obs: Post está com a limitação do DTO
    @PutMapping(value = "/{id}")
    public Client update(@RequestBody DtoClient clientDto){

        Client result = clientService.update(clientDto.clientDto());
        return result;
    }

    @DeleteMapping
    public void delete(@RequestBody Client client){

        clientService.delete(client);
    }
}
