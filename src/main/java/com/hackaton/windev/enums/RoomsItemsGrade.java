package com.hackaton.windev.enums;

public enum RoomsItemsGrade {
	BAD(1),
	LOW(2),
	REGULAR(3),
	HIGH(4),
	GOOD(5);

	private Integer value;

	private RoomsItemsGrade(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
