package com.taozi.day08.entity;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/20 21:10
 */
public class Replacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println(obj.getClass());
		System.out.println(method.getName());
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return obj;
	}
}
