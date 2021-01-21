package com.taozi.day07.custom;

import com.taozi.day07.entity.Address;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/21 10:29
 */
public class AddressInstanceSupplierBDRPP implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		BeanDefinition address = registry.getBeanDefinition("address");
		if (address instanceof GenericBeanDefinition){
			((GenericBeanDefinition) address).setInstanceSupplier(Address::new);
		}
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
