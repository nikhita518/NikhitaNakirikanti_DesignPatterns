package com.mycompany.pattern;

abstract class Shape 
{
	protected Color area1;
	protected Color area2;
	
	protected Shape(Color area1,Color area2)
	{
		this.area1 = area1;
		this.area2 = area2;
	}
	
	abstract public void print();
}
