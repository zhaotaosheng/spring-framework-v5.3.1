package com.taozi.day07.custom;

import com.taozi.day07.entity.Address;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/21 11:11
 */
public class AddressInstanceFactory {

	public Address getAddress(String city) {
		Address address = new Address();
		address.setProvince("instance");
		address.setCity(city);
		return address;
	}
}
