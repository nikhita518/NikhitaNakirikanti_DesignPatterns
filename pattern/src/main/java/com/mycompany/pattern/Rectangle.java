package com.mycompany.pattern;

public class Rectangle extends Shape
{

	protected Rectangle(Color area1, Color area2) 
	{
		super(area1, area2);
	}

	@Override
	public void print() 
	{
		System.out.print("Rectangle ");
		area1.area();
		area2.area();
	}
	
}
