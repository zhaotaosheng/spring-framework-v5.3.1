package com.taozi.day04.importer;

import com.taozi.day04.entity.Person;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 17:38
 */
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder bdb = BeanDefinitionBuilder.genericBeanDefinition(Person.class);
		bdb.addPropertyValue("id", 1);
		bdb.addPropertyValue("name", "桃子");
		registry.registerBeanDefinition("person", bdb.getRawBeanDefinition());
	}
}
