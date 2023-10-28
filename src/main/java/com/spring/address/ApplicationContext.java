package com.spring.address;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext app = new ClassPathXmlApplicationContext("add.xml");
		Employee emp = (Employee) app.getBean("emp");
		System.out.println(emp.toString());
	}
}
