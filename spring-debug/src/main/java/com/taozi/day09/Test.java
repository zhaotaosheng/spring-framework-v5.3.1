package com.taozi.day09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/22 20:13
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day09/annotation.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
