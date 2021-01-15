package com.taozi.day03.custom.label;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/15 6:26
 */
public class TaoZiNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("address", new AddressBeanDefinitionParse());
	}
}
