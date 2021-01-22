package com.taozi.day09;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/22 20:25
 */
public interface Contact {
	String getInfo();

	@Bean
	default Contact getBean(){
		return () -> "null";
	}
}
