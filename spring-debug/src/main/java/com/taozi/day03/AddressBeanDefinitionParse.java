package com.taozi.day03;

import com.taozi.day03.entity.Address;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/15 6:19
 */
public class AddressBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return Address.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String province = element.getAttribute("province");
		String city = element.getAttribute("city");
		if (StringUtils.hasText(id)){
			builder.addPropertyValue("id",id);
		} else {
			builder.addPropertyValue("id",Address.class.getCanonicalName());
		}
		if (StringUtils.hasText(province)){
			builder.addPropertyValue("province",province);
		}
		if (StringUtils.hasText(city)){
			builder.addPropertyValue("city",city);
		}
	}
}
