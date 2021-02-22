package com.taozi.day11.service;

import com.taozi.day11.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhaoTaoSheng
 * @since 2021/2/22 21:04
 */
@Service
public class TestService {

	@Autowired
	private TestDao testDao;

	public String get(){
		return testDao.getConnection();
	}
}
