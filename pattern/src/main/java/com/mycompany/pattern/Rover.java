package com.mycompany.pattern;

public class Rover extends BasicCar
{
	@Override
	public void produce()
	{
		super.produce();
		System.out.println("Adding the properties of Rover");
	}
}
