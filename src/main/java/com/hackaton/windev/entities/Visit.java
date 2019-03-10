package com.hackaton.windev.entities;

import com.hackaton.windev.enums.PaymentMethod;
import com.hackaton.windev.enums.VisitStatus;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Visit implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String scheduledTime;

	@Enumerated(EnumType.STRING)
	private VisitStatus visitStatus;

	private Double change;

	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;

	private Integer review;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@OneToOne
	@JoinColumn(name = "property_id")
	private Property property;

	public Visit() {
	}

	public Visit(String scheduledTime, VisitStatus visitStatus, Double change, PaymentMethod paymentMethod, Integer review, Person person, Property property) {
		this.scheduledTime = scheduledTime;
		this.visitStatus = visitStatus;
		this.change = change;
		this.paymentMethod = paymentMethod;
		this.review = review;
		this.person = person;
		this.property = property;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public VisitStatus getVisitStatus() {
		return visitStatus;
	}

	public void setVisitStatus(VisitStatus visitStatus) {
		this.visitStatus = visitStatus;
	}

	public Double getChange() {
		return change;
	}

	public void setChange(Double change) {
		this.change = change;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Integer getReview() {
		return review;
	}

	public void setReview(Integer review) {
		this.review = review;
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

	@Override
	public String toString() {
		return "Visit{" +
				"id=" + id +
				", scheduledTime='" + scheduledTime + '\'' +
				", visitStatus=" + visitStatus +
				", change=" + change +
				", paymentMethod=" + paymentMethod +
				", review=" + review +
				", person=" + person +
				", property=" + property +
				'}';
	}
}
