package com.taozi.day03;

import com.taozi.day03.entity.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/13 10:26
 */
public class MyTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:day03/application.xml");
		Address address = context.getBean(Address.class);
		System.out.println(address);
	}

	/*
	XmlBeanDefinitionReader -> DefaultBeanDefinitionDocumentReader -> BeanDefinitionParserDelegate -> NamespaceHandler -> BeanDefinitionParser

	BeanDefinitionBuilder -> BeanDefinition -> BeanDefinitionHolder
	 */
}
