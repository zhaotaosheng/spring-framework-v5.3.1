package com.taozi.day07;

import com.taozi.day07.entity.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/21 10:35
 */
public class TestInstanceSupplier {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day07/instanceSupplier.xml");
		Address address1 = context.getBean("address", Address.class);
		System.out.println(address1);
		Address address2 = context.getBean("address", Address.class);
		System.out.println(address2);
	}
}
