package com.spring.address;

public class Employee {
	private int id;
	private String name;
	private Address add;

	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

}
