package com.prueba.dispapeles.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "clients", schema = "public")
@Data
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "identification")
	private Integer idnetificacion;
	@Column(name = "name")
	private String nombre;
	@Column(name = "lastName")
	private String apellido;
	@Column(name = "age")
	private Integer edad;
	@Column(name = "phone")
	private String telefono;
	@Column(name = "address")
	private String direccion;
}
