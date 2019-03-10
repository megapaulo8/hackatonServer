package com.hackaton.windev.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class PeopleRoles implements Serializable {

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "role_id")
	private PersonRole personRole;

	public PeopleRoles() {
	}

	public PeopleRoles(Person person, PersonRole personRole) {
		this.person = person;
		this.personRole = personRole;
	}

	public Person getNeighborhood() {
		return person;
	}

	public void setNeighborhood(Person property) {
		this.person = property;
	}

	public PersonRole getPersonRole() {
		return personRole;
	}

	public void setPersonRole(PersonRole specification) {
		this.personRole = specification;
	}

	@Override
	public String toString() {
		return "PeopleRoles{" +
				"person=" + person +
				", personRole=" + personRole +
				'}';
	}
}
