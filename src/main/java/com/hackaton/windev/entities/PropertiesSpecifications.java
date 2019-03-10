package com.hackaton.windev.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PropertiesSpecifications implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;

	@ManyToOne
	@JoinColumn(name = "specification_id")
	private Specification specification;

	public PropertiesSpecifications() {
	}

	public PropertiesSpecifications(Property property, Specification specification) {
		this.property = property;
		this.specification = specification;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
				"id=" + id +
				", property=" + property +
				", specification=" + specification +
				'}';
	}
}
