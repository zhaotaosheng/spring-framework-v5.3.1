package com.taozi.day06.entity;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 16:17
 */
public class Email {
	private int id;
	private String context;
	private Address address;

	public Email() {
	}

	public Email(int id, String context, Address address) {
		this.id = id;
		this.context = context;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Email{" +
				"id=" + id +
				", context='" + context + '\'' +
				", address=" + address +
				'}';
	}
}
