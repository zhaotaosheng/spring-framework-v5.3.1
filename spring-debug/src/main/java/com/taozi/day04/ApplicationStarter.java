package com.taozi.day04;

import com.taozi.day04.entity.Address;
import com.taozi.day04.importer.CustomImport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhaoTaoSheng
 * @since 2021/1/16 17:26
 */
@Configuration
@ComponentScan
@Import({CustomImport.class, CustomImportResource.class})
public class ApplicationStarter {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/day04/application.xml");
		Address bean = context.getBean(Address.class);
		System.out.println(bean);
	}
}
