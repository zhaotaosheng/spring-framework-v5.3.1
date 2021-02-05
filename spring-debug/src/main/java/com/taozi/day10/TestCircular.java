package com.taozi.day10;

import com.taozi.day10.circular.A;
import com.taozi.day10.circular.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author taosheng.zhao
 * @since 2021/2/5 13:44
 */
public class TestCircular {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("day10/circular.xml");
		A a = context.getBean(A.class);
		a.aMethod();
		System.out.println(a);
		B b = context.getBean(B.class);
		System.out.println(b);
	}
}
