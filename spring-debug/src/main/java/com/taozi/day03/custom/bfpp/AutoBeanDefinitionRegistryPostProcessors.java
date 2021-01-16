package com.taozi.day03.custom.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 7:32
 */
public class AutoBeanDefinitionRegistryPostProcessors implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("这是自动注入的BDRPP的postProcessBeanFactory方法");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("这是自动注入的BDRPP的postProcessBeanDefinitionRegistry方法");
	}
}
