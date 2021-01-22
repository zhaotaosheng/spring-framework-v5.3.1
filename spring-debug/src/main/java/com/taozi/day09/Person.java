package com.taozi.day09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/22 20:05
 */
@Component
public class Person {
	private int id;
	@Value("${USERDOMAIN}")
	private String name;
	@Autowired
	private Gender gender;
	@Autowired
	@Qualifier("telephone")
	private Contact contact;
	@Autowired
	private Address address;
	@Autowired
	private Map<String,Object> map;

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender=" + gender +
				", contact=" + contact +
				", address=" + address +
				", map=" + map +
				'}';
	}

	@Bean
	public Gender genderBean(){
		return Gender.MALE;
	}
}
