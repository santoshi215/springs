package com.hefshine.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
@SuppressWarnings("resource")
public static void main(String[] args) {		
		
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee) con.getBean("e1");
		emp.work();
		

	}
}
