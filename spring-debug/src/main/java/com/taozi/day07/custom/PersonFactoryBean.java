package com.taozi.day07.custom;

import com.taozi.day07.entity.Address;
import com.taozi.day07.entity.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 19:40
 */
public class PersonFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		return new Person(1, "桃子", new Address());
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
