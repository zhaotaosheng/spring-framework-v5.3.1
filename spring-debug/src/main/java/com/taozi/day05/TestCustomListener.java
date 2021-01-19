package com.taozi.day05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 11:05
 */
public class TestCustomListener extends ClassPathXmlApplicationContext{

	public TestCustomListener(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	protected void prepareBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.publishEvent(new CustomEvent(this));
		super.prepareBeanFactory(beanFactory);
	}

	public static void main(String[] args) {
		ApplicationContext context = new TestCustomListener("day05/listener.xml");
	}
}
