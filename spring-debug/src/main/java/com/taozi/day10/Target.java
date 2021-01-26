package com.taozi.day10;

/**
 * @author taosheng.zhao
 * @since 2021/1/26 14:19
 */
public class Target {

	public void one(){
		System.out.println("Target 类 方法 one");
	}

	public void two(){
		System.out.println("Target 类 方法 two");
		throw new NullPointerException("fuck");
	}

	public String three(String str){
		System.out.println("Target 类 方法 three");
		return "this is three";
	}
}
