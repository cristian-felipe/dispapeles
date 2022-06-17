package com.prueba.dispapeles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.dispapeles.model.Client;

public interface IClientRepository extends JpaRepository<Client, Integer>{

}
