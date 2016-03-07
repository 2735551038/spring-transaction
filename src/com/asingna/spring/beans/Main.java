package com.asingna.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("world");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		//helloWorld.hello();
	}
}
