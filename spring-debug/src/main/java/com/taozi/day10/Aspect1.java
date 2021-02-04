package com.taozi.day10;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.InvocationTargetException;

/**
 * @author taosheng.zhao
 * @since 2021/1/26 14:17
 */
public class Aspect1 {

	public Object before(JoinPoint joinPoint) throws InvocationTargetException, IllegalAccessException {
		System.out.println("Aspect1 类 方法 before");
		System.out.println("-----------------------------------");
		return "this is before";
	}

	public Object after(JoinPoint joinPoint) {
		System.out.println("Aspect1 类 方法 after");
		System.out.println("-----------------------------------");
		return "this is after";
	}

	public Object afterReturning(JoinPoint joinPoint, Object res) {
		System.out.println("Aspect1 类 方法 afterReturning");
		System.out.println("-----------------------------------");
		return "this is afterReturning";
	}

	public Object afterThrowing(JoinPoint joinPoint, Exception e) {
		System.out.println("Aspect1 类 方法 afterThrowing");
		System.out.println("-----------------------------------");
		return "this is afterThrowing";
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Aspect1 类 方法 around before");
		System.out.println("-----------------------------------");
		Object o = pjp.proceed();
		System.out.println("Aspect1 类 方法 around after");
		System.out.println("-----------------------------------");
		return "this is around";
	}
}
