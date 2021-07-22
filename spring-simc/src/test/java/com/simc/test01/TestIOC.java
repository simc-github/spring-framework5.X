package com.simc.test01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIOC {

	@Test
	public  void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		TestBean bean = applicationContext.getBean(TestBean.class);
		bean.aaa();
	}
}
