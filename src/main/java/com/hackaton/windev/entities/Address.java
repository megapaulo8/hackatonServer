package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String cep;
	private String street;
	private String complement;
	private String number;

	@OneToOne
	@JoinColumn(name = "neighborhood_id")
	private Neighborhood neighborhood;

	public Address() {
	}

	public Address(String cep, String street, String complement, String number, Neighborhood neighborhood) {
		this.cep = cep;
		this.street = street;
		this.complement = complement;
		this.number = number;
		this.neighborhood = neighborhood;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", cep='" + cep + '\'' +
				", street='" + street + '\'' +
				", complement='" + complement + '\'' +
				", number='" + number + '\'' +
				", neighborhood=" + neighborhood +
				'}';
	}
}
