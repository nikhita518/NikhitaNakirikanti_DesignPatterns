package com.mycompany.pattern;

public class Singleton 
{
	private static volatile Singleton instance = null;
	
	public String s;
	
	private Singleton()
	{
		s = "Number of instances are 1 in Singleton Design Pattern";
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
			instance = new Singleton();
		else
			System.out.println("Already an instance is created");
		return instance;
	}
}
