package com.taozi.day06;

import com.taozi.day06.entity.Address;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 16:11
 */
public class CustomConverterFactory implements ConverterFactory<String, Address> {

	@Override
	public <T extends Address> Converter<String, T> getConverter(Class<T> targetType) {
		return new StringToAddress<>(targetType);
	}

	private static final class StringToAddress<T extends Address> implements Converter<String, T> {

		private final Class<T> targetType;

		public StringToAddress(Class<T> targetType) {
			this.targetType = targetType;
		}

		@Override
		@Nullable
		public T convert(String source) {
			if (source.isEmpty()) {
				return null;
			}
			T instance = null;
			String[] addressInfo = source.split("_");
			try {
				instance = targetType.getDeclaredConstructor(String.class, String.class).newInstance(addressInfo[0], addressInfo[1]);
			} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
				e.printStackTrace();
			}
			return instance;
		}
	}
}
