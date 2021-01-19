package com.taozi.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/7 20:05
 */
public class Overview {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day01/overview.xml");
	}
}
