package com.hackaton.windev.entities;

import com.hackaton.windev.enums.PropertyContractType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Property implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Person person;

	@OneToOne
	@JoinColumn(name = "category_id")
	private PropertyCategory category;

	private String code;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@Enumerated(EnumType.STRING)
	private PropertyContractType contractType;

	private String description;
	private Double score;
	private Integer viewCount;

	public Property() {
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

	public PropertyCategory getCategory() {
		return category;
	}

	public void setCategory(PropertyCategory category) {
		this.category = category;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PropertyContractType getContractType() {
		return contractType;
	}

	public void setContractType(PropertyContractType contractType) {
		this.contractType = contractType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Property{" +
				"id=" + id +
				", person=" + person +
				", category=" + category +
				", address=" + address +
				", contractType=" + contractType +
				", description='" + description + '\'' +
				", score=" + score +
				", viewCount=" + viewCount +
				'}';
	}
}
