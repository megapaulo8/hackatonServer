package com.hackaton.windev.entities;

import com.hackaton.windev.enums.StateAbbreviation;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Enumerated(EnumType.STRING)
	private StateAbbreviation stateAbbreviation;

	private String name;

	public City() {
	}

	public City(String name, StateAbbreviation stateAbbreviation) {
		this.name = name;
		this.stateAbbreviation = stateAbbreviation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateAbbreviation getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(StateAbbreviation stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", name='" + name + '\'' +
				", stateAbbreviation='" + stateAbbreviation + '\'' +
				'}';
	}
}
