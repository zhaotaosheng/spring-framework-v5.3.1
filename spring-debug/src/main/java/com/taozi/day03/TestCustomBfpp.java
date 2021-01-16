package com.taozi.day03;

import com.taozi.day03.custom.bfpp.ManualBeanDefinitionRegistryPostProcessors;
import com.taozi.day03.custom.bfpp.ManualBeanFactoryPostProcessors;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 7:30
 */
public class TestCustomBfpp extends ClassPathXmlApplicationContext {

	public TestCustomBfpp(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("这是直接编写执行的postProcessBeanFactory方法");
		super.addBeanFactoryPostProcessor(new ManualBeanFactoryPostProcessors());
		super.addBeanFactoryPostProcessor(new ManualBeanDefinitionRegistryPostProcessors());
		super.postProcessBeanFactory(beanFactory);
	}

	public static void main(String[] args) {
		ApplicationContext context = new TestCustomBfpp("classpath:day03/custom-bfpp.xml");
	}
}
