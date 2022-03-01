package com.devinhouse.devinmarket.service;

import com.devinhouse.devinmarket.models.Client;
import com.devinhouse.devinmarket.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final List<Client> products = new ArrayList<>();

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll(){
        return (List<Client>) clientRepository.findAll();
    }

    public Client findById (Long id){
        Client result = clientRepository.findById(id).get();

        return result;
    }

    public Client add(Client client){

        Client result = clientRepository.save(client);
        return result;
    }

    public Client update(Client client){

        Client result = clientRepository.save(client);
        return result;
    }

    public void delete(Client client){
        clientRepository.delete(client);
    }
}
