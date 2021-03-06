package com.Tutorial.Hamid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape   {
	//Attribute
	private Point center;
	
	//Setter and Getter Methods	
	public Point getCenter() {
		return center;
	}
	
	@Autowired	
	@Qualifier(value = "bPoint")
	//@Qualifier("cP")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Draw: " + center.getxPoint() +" " + center.getyPoint());
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}	

}