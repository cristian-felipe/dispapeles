package com.prueba.dispapeles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dispapeles.model.Client;
import com.prueba.dispapeles.service.IClientService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	IClientService clientService;
	
    @GetMapping("/all")
    public List<Client> listAll() {
    	return clientService.findAll();
    }
    

    @PostMapping("/save")
    public Client create(@RequestBody Client accessory) {
        return clientService.save(accessory);
    }

    @PutMapping("/update")
    public Client update(@RequestBody Client accessory) {
        return clientService.update(accessory);
    }
    
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return clientService.delete(id);
    }


}
