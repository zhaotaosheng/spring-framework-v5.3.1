package com.taozi.day08;

import com.taozi.day08.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/20 21:15
 */
public class TestOverride {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day08/override.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getAddress());
		System.out.println(person.getAddress());
		person.say("world");
		person.say("taozi");
	}
}
