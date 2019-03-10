package com.hackaton.windev.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class PropertiesSpecifications implements Serializable {

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;

	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "specification_id")
	private Specification specification;

	public PropertiesSpecifications() {
	}

	public PropertiesSpecifications(Property property, Specification specification) {
		this.property = property;
		this.specification = specification;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	@Override
	public String toString() {
		return "PropertiesSpecifications{" +
				"property=" + property +
				", specification=" + specification +
				'}';
	}
}
