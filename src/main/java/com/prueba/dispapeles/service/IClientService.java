package com.prueba.dispapeles.service;

import java.util.List;

import com.prueba.dispapeles.model.Client;

public interface IClientService {
	
	List<Client> findAll();
	
	Client FindById(Integer id);
	
	Client save(Client client);
	
	Boolean delete(Integer id);
	
	Client update(Client client);

}
