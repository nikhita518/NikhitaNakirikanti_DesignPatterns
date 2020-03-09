package com.mycompany.pattern;

public class Benz extends BasicCar
{
	
	@Override
	public void produce()
	{
		super.produce();
		System.out.println("Adding the properties of Benz");
	}
}
