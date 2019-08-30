package com.ks.model;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("accountbean.xml");
		Person p1 = (Person)context.getBean("person1");
		Person p2 = (Person)context.getBean("person2");
		p1.invokeWithdraw(10000);
		p2.invokeWithdraw(15000);
		Person p3 = (Person) context.getBean("person3");
		p3.invokeWithdraw(900);
		context.close();
	}
}
