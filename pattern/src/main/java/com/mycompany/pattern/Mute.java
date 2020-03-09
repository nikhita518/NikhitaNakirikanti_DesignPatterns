package com.mycompany.pattern;

public class Mute implements TVState
{

	@Override
	public void statechange(TVStateChange tv) 
	{
		System.out.println("TV volume state is changed to MUTE");
	}
	
}
