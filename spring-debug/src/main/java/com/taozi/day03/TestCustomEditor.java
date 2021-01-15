package com.taozi.day03;

import com.taozi.day03.custom.aware.AddressAware;
import com.taozi.day03.custom.aware.AddressAwareProcessor;
import com.taozi.day03.custom.editor.AddressPropertyEditorRegistrar;
import com.taozi.day03.entity.Address;
import com.taozi.day03.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/13 10:26
 */
public class TestCustomEditor extends ClassPathXmlApplicationContext {

	public TestCustomEditor(String... configLocations) throws BeansException {
		super(configLocations);
	}

	@Override
	protected void prepareBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		// 添加属性编辑注册器，其内部添加特定类型的属性编辑器
		beanFactory.addPropertyEditorRegistrar(new AddressPropertyEditorRegistrar());
		super.prepareBeanFactory(beanFactory);
	}

	public static void main(String[] args) {
		ApplicationContext context = new TestCustomEditor("classpath:day03/custom-editor.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
