package com.taozi.day07.entity;

import com.taozi.day07.custom.AddressFactoryBean;
import com.taozi.day07.custom.PersonFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 19:38
 */
public class TestInstantiationAware {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day07/instantiationAware.xml");
		Address address1 = context.getBean("address", Address.class);
		System.out.println(address1);
		Address address2 = context.getBean("address", Address.class);
		System.out.println(address2);
	}
}
