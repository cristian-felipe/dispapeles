package com.prueba.dispapeles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dispapeles.model.Client;
import com.prueba.dispapeles.repository.IClientRepository;
import com.prueba.dispapeles.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService{
	
	@Autowired
	IClientRepository clientRepository;

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client FindById(Integer id) {
		return null;
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Boolean delete(Integer id) {
		try {
		Optional<Client> client=clientRepository.findById(id);
		if(client!=null) {
			clientRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

}
