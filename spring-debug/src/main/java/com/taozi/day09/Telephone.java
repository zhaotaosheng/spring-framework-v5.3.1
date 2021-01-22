package com.taozi.day09;

import org.springframework.stereotype.Component;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/22 20:26
 */
@Component
public class Telephone implements Contact{
	private String context;
	private boolean primary;

	@Override
	public String getInfo() {
		return context;
	}
}
