package com.taozi.day11.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

/**
 * @author ZhaoTaoSheng
 * @since 2021/2/22 21:04
 */
@Repository
@PropertySource("classpath:day11/dao.properties")
public class TestDao {

	@Value("${dao.name}")
	private String name;

	@Value("${dao.username}")
	private String username;

	@Value("${dao.password}")
	private int password;

	public String getConnection() {
		return name + "," + username + "," + password;
	}
}
