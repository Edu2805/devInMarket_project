package com.devinhouse.devinmarket.repositories;

import com.devinhouse.devinmarket.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
