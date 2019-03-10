package com.hackaton.windev.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class Contract implements Serializable {

	@EmbeddedId
	@OneToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@EmbeddedId
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
				"person=" + person +
				", property=" + property +
				", contractCode='" + contractCode + '\'' +
				'}';
	}
}
