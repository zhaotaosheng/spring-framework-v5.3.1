package com.taozi.day06;

import com.taozi.day06.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 15:41
 */
public class TestCustomConverter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day06/converter.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
