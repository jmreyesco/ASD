package com.bolsadeideas.springboot.backend.apirest.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long address_id;

	private String city;
	private String states;
	private String postal_code;
	private String country;

	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)

	private Cliente cliente;

	public Address() {
		super();
	}

	public Address(Long address_id, String city, String states, String postal_code, String country, Cliente cliente) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.states = states;
		this.postal_code = postal_code;
		this.country = country;
		this.cliente = cliente;
	}

	public Long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
