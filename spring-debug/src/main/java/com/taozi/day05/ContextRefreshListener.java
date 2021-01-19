package com.taozi.day05;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 11:05
 */
public class ContextRefreshListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(event.getClass());
		System.out.println(event.getSource());
		System.out.println(event.getTimestamp());
		System.out.println(event.getApplicationContext().getApplicationName());
	}
}
