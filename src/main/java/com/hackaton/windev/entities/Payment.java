package com.hackaton.windev.entities;

import com.hackaton.windev.enums.PaymentStatus;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Payment implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private Double amount;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;

	public Payment() {
	}

	public Payment(Double amount, Person person, PaymentStatus paymentStatus) {
		this.amount = amount;
		this.person = person;
		this.paymentStatus = paymentStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Payment{" +
				"id=" + id +
				", amount=" + amount +
				", person=" + person +
				", paymentStatus=" + paymentStatus +
				'}';
	}
}
