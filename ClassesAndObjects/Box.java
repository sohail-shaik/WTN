package com.wipro.ClassesAndObjects;

public class Box {
	double length,breadth,height;
	Box(double l,double b,double h )
	{
		 this.length=l;
		 this.breadth=b;
		 this.height=h;	
	}
	double volume()
	{
		return length*breadth*height;
	}
}
