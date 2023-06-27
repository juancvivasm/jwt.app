package com.bolsadeideas.springboot.jwt.app.controllers;

import com.bolsadeideas.springboot.jwt.app.entity.Client;
import com.bolsadeideas.springboot.jwt.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/pet/{petId}")
    public List<Client> getClients() {
        return clientService.findAllClients();
    }

}