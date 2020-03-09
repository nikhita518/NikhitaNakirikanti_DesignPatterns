package com.mycompany.pattern;

public class Circle extends Shape
{

	protected Circle(Color area1, Color area2) 
	{
		super(area1, area2);
	}

	@Override
	public void print() 
	{
		System.out.print("Circles: ");
		area1.area();
		area2.area();
	}
	
}
