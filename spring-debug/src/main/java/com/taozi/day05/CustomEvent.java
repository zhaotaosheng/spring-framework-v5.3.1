package com.taozi.day05;

import org.springframework.context.ApplicationEvent;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/19 11:03
 */
@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public CustomEvent(Object source) {
		super(source);
	}
}
