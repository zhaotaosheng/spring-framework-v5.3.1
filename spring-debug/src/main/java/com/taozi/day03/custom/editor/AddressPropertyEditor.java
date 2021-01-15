package com.taozi.day03.custom.editor;

import com.taozi.day03.entity.Address;

import java.beans.PropertyEditorSupport;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/15 10:27
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] addressInfo = text.split("_");
		Address address = new Address();
		address.setProvince((addressInfo[0]));
		address.setCity((addressInfo[1]));
		setValue(address);
	}
}
