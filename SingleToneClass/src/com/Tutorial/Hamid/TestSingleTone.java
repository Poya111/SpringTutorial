package com.Tutorial.Hamid;

public class TestSingleTone {
	private static TestSingleTone t;
	
	private TestSingleTone() {
		System.out.println("Terst Object singleTone Class");		
	}
	
	public static TestSingleTone getInstance() {
		if(t ==null) {
			t = new TestSingleTone();
			return t;
		}
		else
		{
			return t;
		}
	}
	
	//With Clone right now, it is not possible to create instance
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		
	}	  
}
