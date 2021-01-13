package com.taozi.day02;

import org.springframework.context.ApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/13 10:28
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new MyClassPathXmlApplicationContext("classpath*:day02/application.xml");
	}
}
