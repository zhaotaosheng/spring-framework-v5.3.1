package com.taozi.day02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/13 10:26
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocation) throws BeansException {
		super(configLocation);
	}

	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("USERDOMAIN");
		super.initPropertySources();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowCircularReferences(true);
		super.setAllowBeanDefinitionOverriding(true);
//		beanFactory.setAllowCircularReferences(true);
		super.customizeBeanFactory(beanFactory);
	}

	public static void main(String[] args) {
		ApplicationContext context = new MyClassPathXmlApplicationContext("classpath:day02/application.xml");
	}
}
