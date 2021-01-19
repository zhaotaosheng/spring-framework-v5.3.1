package com.taozi.day07;

import com.taozi.day07.entity.Person;
import com.taozi.day07.custom.AddressFactoryBean;
import com.taozi.day07.custom.PersonFactoryBean;
import com.taozi.day07.entity.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 19:38
 */
public class TestFactoryBean {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day07/factoryBean.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
		PersonFactoryBean personFactoryBean = context.getBean("&person", PersonFactoryBean.class);
		System.out.println(personFactoryBean);
		AddressFactoryBean addressFactoryBean = context.getBean("&address", AddressFactoryBean.class);
		System.out.println(addressFactoryBean);
	}
}
