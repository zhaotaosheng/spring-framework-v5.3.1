package com.taozi.day04.entity;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/7 21:36
 */
public class Address {
	private String province;
	private String city;

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

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				'}';
	}
}