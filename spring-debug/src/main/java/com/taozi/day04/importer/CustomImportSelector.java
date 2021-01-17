package com.taozi.day04.importer;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 17:37
 */
public class CustomImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		String[] className = {"com.taozi.day04.importer.CustomImportBeanDefinitionRegistrar"};
		return className;
	}
}
