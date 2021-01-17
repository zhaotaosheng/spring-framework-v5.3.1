package com.taozi.day04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 17:30
 */
@Configuration
@PropertySource("classpath:day04/address.properties")
public class CustomPropertySource {

	@Value("${address.province}")
	private String province;
	@Value("${address.city}")
	private String city;

	public String getProvince() {
		return province;
	}

	public String getCity() {
		return city;
	}
}
