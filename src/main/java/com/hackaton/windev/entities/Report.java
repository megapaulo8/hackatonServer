package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Report implements Serializable {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@OneToOne
	@JoinColumn(name = "property_id")
	private Property property;

	private String date;

	public Report() {
	}

	public Report(Person person, Property property, String date) {
		this.person = person;
		this.property = property;
		this.date = date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Report{" +
				"id=" + id +
				", person=" + person +
				", property=" + property +
				", date='" + date + '\'' +
				'}';
	}
}
