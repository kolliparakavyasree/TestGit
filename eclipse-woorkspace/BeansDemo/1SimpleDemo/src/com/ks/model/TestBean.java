package com.ks.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloBean h1 = (HelloBean)context.getBean("helloworld");
		h1.sayHello();
		((AbstractApplicationContext) context).close();
	} 
	
}
