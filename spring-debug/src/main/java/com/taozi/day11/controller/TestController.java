package com.taozi.day11.controller;

import com.taozi.day11.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ZhaoTaoSheng
 * @since 2021/2/22 21:04
 */
@Controller
public class TestController {

	@Autowired
	private TestService testService;

	public String get(){
		return testService.get();
	}
}
