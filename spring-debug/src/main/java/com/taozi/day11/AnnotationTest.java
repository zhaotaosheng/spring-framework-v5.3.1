package com.taozi.day11;

import com.taozi.day11.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ZhaoTaoSheng
 * @since 2021/2/22 21:03
 */
@ComponentScan
public class AnnotationTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationTest.class);
		TestController controller = context.getBean(TestController.class);
		System.out.println(controller.get());
	}
}
