package com.taozi.day10;

/**
 * @author taosheng.zhao
 * @since 2021/1/26 14:17
 */
public class Aspect {

	public void before(){
		System.out.println("Aspect 类 方法 before");
	}

	public void after(){
		System.out.println("Aspect 类 方法 after");
	}

	public void afterReturning(){
		System.out.println("Aspect 类 方法 afterReturning");
	}
	public void afterThrowing(){
		System.out.println("Aspect 类 方法 afterThrowing");
	}

	public void around(){
		System.out.println("Aspect 类 方法 around");
	}
}
