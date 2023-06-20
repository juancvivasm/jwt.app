package com.bolsadeideas.springboot.jwt.app.service;

import com.bolsadeideas.springboot.jwt.app.entity.Client;
import com.bolsadeideas.springboot.jwt.app.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllClients(){
        List<Client> clientList = clientRepository.findAll();
        return clientList;
    }
}
