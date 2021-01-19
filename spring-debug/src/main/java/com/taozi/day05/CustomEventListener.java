package com.taozi.day05;

import org.springframework.context.ApplicationListener;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 11:05
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.getClass());
		System.out.println(event.getSource());
		System.out.println(event.getTimestamp());
	}
}
