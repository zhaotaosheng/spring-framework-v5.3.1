package com.taozi.day03;

import com.taozi.day03.custom.aware.AddressAware;
import com.taozi.day03.custom.aware.AddressAwareProcessor;
import com.taozi.day03.custom.aware.Person;
import com.taozi.day03.entity.Address;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/13 10:26
 */
public class TestCustomAware extends ClassPathXmlApplicationContext {

	public TestCustomAware(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	protected void prepareBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		// 忽略了注入，统一由后置处理器注入
		beanFactory.addBeanPostProcessor(new AddressAwareProcessor(this));
		// 自动注入时，忽略给定类型依赖的自动注入
		beanFactory.ignoreDependencyType(Address.class);
		// 自动注入时，忽略实现给定接口的setter注入
		beanFactory.ignoreDependencyInterface(AddressAware.class);
		super.prepareBeanFactory(beanFactory);
	}


	public static void main(String[] args) {
		ApplicationContext context = new TestCustomAware("classpath:day03/custom-aware.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
