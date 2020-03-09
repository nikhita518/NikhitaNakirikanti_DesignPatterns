package com.mycompany.pattern;

public class Change implements TVState
{

	@Override
	public void statechange(TVStateChange tv) 
	{
		System.out.println("Change in channel as well as volume");
	}
	
}
