package com.taozi.day10;

import com.taozi.day09.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author taosheng.zhao
 * @since 2021/1/26 14:25
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day10/aop.xml");
		Target bean = context.getBean(Target.class);
//		bean.one();
//		bean.two();
		System.out.println(bean.three("iiiiiiii"));
	}
}
