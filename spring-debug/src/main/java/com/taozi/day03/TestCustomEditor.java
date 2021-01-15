package com.taozi.day03;

import com.taozi.day03.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/13 10:26
 */
public class TestCustomEditor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:day03/custom-editor.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
