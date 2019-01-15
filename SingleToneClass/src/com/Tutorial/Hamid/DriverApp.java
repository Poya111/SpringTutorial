package com.Tutorial.Hamid;


import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverApp {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		TestSingleTone ts1 =(TestSingleTone) ap.getBean("t");
		TestSingleTone ts2 =(TestSingleTone) ap.getBean("t");
		
		//if it's true, means it's singletone class.
		System.out.println(ts1==ts2);
		
		//Create an instance from Calendar by xml file
		Calendar ca1 = (Calendar) ap.getBean("ca");
		Calendar ca2 = (Calendar) ap.getBean("ca");
		System.out.println(ca1 == ca2);
	}

}
