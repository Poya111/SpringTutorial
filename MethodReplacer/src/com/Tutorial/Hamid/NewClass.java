package com.Tutorial.Hamid;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewClass implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method m, Object[] param) throws Throwable {
		System.out.println("20% instead of 10%");
		return obj;
	}

}
