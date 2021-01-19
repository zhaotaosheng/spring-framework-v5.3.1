package com.taozi.day06;

import com.taozi.day06.entity.Address;
import com.taozi.day06.entity.Email;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 16:15
 */
public class CustomGenericConverter implements GenericConverter {

	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		Set<ConvertiblePair> set = new HashSet<>();
		set.add(new ConvertiblePair(String.class, Address.class));
		set.add(new ConvertiblePair(String.class, Email.class));
		return set;
	}

	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		Class<?> targetClass = targetType.getType();
		if (targetClass.isAssignableFrom(Address.class)){
			String sourceAddress =  (String) source;
			String[] addressInfo = sourceAddress.split("_");
			Address address = new Address();
			address.setProvince((addressInfo[0]));
			address.setCity((addressInfo[1]));
			source = address;
		}else if (targetClass.isAssignableFrom(Email.class)){
			String sourceEmail =  (String) source;
			String[] emailInfo = sourceEmail.split("_");
			Email email = new Email();
			email.setId(Integer.parseInt(emailInfo[0]));
			email.setContext(emailInfo[1]);
			Address address = new Address();
			address.setProvince((emailInfo[2]));
			address.setCity((emailInfo[3]));
			email.setAddress(address);
			source = email;
		}
		return source;
	}
}
