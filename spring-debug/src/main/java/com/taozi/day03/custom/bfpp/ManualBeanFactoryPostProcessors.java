package com.taozi.day03.custom.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 7:31
 */
public class ManualBeanFactoryPostProcessors implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("这是手动注入的BFPP的postProcessBeanFactory方法");
	}
}
