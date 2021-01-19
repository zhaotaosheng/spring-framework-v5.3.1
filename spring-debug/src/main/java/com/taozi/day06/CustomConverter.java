package com.taozi.day06;

import com.taozi.day06.entity.Address;
import org.springframework.core.convert.converter.Converter;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 15:32
 */
public class CustomConverter implements Converter<String, Address> {

	@Override
	public Address convert(String source) {
		String[] addressInfo = source.split("_");
		Address address = new Address();
		address.setProvince((addressInfo[0]));
		address.setCity((addressInfo[1]));
		return address;
	}
}
