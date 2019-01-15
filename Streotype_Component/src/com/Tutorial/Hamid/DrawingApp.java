package com.Tutorial.Hamid;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext cr = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		//circle as argument in getBean should be used a lowercase
		Circle c= (Circle)cr.getBean("circle");
		System.out.println(c);
		c.draw();

	}

}
