package com.taozi.day03.custom.aware;

import com.taozi.day03.entity.Address;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringValueResolver;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/15 15:23
 */
public class AddressAwareProcessor implements BeanPostProcessor {

	private final ConfigurableApplicationContext applicationContext;

	public AddressAwareProcessor(ConfigurableApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof AddressAware) {
			((AddressAware) bean).setAddress(applicationContext.getBean(Address.class));
		}
		return bean;
	}
}
