package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CreditCard implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String number;
	private String expirationDate;
	private String securityCode;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	public CreditCard() {
	}

	public CreditCard(String number, String expirationDate, String securityCode, Person person) {
		this.number = number;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.person = person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "CreditCard{" +
				"id=" + id +
				", number='" + number + '\'' +
				", expirationDate='" + expirationDate + '\'' +
				", securityCode='" + securityCode + '\'' +
				", person=" + person +
				'}';
	}
}
