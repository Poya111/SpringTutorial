package com.Tutorial.Hamid;

public class Point {
	//Attributes
		private int xPoint;
		private int yPoint;
		
		//Getter and Setter
		public int getxPoint() {
			return xPoint;
		}
		public void setxPoint(int xPoint) {
			this.xPoint = xPoint;
		}
		public int getyPoint() {
			return yPoint;
		}
		public void setyPoint(int yPoint) {
			this.yPoint = yPoint;
		}
		//toString
		@Override
		public String toString() {
			return "Point [xPoint=" + xPoint + ", yPoint=" + yPoint + "]";
		}	

}
