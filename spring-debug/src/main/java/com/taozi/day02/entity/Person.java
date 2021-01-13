package com.taozi.day02.entity;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/7 21:36
 */
public class Person {
	private int id;
	private String name;
	private Address address;

	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
