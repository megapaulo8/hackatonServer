package com.hackaton.windev.entities;

import com.hackaton.windev.enums.BankAccountType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BankAccount implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	private String bankName;
	private String account;
	private String agency;

	@Enumerated(EnumType.STRING)
	private BankAccountType bankAccountType;

	public BankAccount() {
	}

	public BankAccount(Person person, String bankName, String account, String agency, BankAccountType bankAccountType) {
		this.person = person;
		this.bankName = bankName;
		this.account = account;
		this.agency = agency;
		this.bankAccountType = bankAccountType;
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

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public BankAccountType getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(BankAccountType bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"id=" + id +
				", person=" + person +
				", bankName='" + bankName + '\'' +
				", account='" + account + '\'' +
				", agency='" + agency + '\'' +
				", bankAccountType=" + bankAccountType +
				'}';
	}
}
