package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

public class Contract implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@OneToOne
	@JoinColumn(name = "property_id")
	private Property property;

	private String contractCode;

	public Contract() {
	}

	public Contract(Person person, Property property, String contractCode) {
		this.person = person;
		this.property = property;
		this.contractCode = contractCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	@Override
	public String toString() {
		return "Contract{" +
				"id=" + id +
				", person=" + person +
				", property=" + property +
				", contractCode='" + contractCode + '\'' +
				'}';
	}
}
