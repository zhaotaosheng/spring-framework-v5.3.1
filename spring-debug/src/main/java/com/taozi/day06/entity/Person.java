package com.taozi.day06.entity;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/7 21:36
 */
public class Person {
	private int id;
	private String name;
	private Email email;
	private Address address;

	public Person() {
	}

	public Person(int id, String name, Email email, Address address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email=" + email +
				", address=" + address +
				'}';
	}
}
