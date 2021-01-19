package com.taozi.day07.custom;

import com.taozi.day07.entity.Address;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 19:39
 */
public class AddressFactoryBean implements FactoryBean<Address> {

	@Override
	public Address getObject() throws Exception {
		return new Address("辽宁","沈阳");
	}

	@Override
	public Class<?> getObjectType() {
		return Address.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
