package com.taozi.day01.entity;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/7 21:36
 */
public class Address {
	private String province;
	private String city;

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

	public void setCity1(String city) {
		this.city = city;
	}
}
