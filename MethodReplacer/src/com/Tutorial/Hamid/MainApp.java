package com.Tutorial.Hamid;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank ba = (Bank)ap.getBean("b");
		//using this method to show proxy class which is made from Bank class 
		System.out.println(ba.getClass().getCanonicalName());
				
		ba.Deposite();
		ba.Withdraw();
		ba.CalInterest();			

	}

}
