package com.taozi.day08.entity;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/7 21:36
 */
public class Address {
	private String province;
	private String city;

	public Address() {
		System.out.println(this.hashCode());
	}

	public Address(String province, String city) {
		this.province = province;
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
