package com.mycompany.pattern;

public class TVStateChange 
{
	private TVState state;
	
	public TVStateChange()
	{
		state = new Change();
	}
	
	public void setState(TVState state)
	{
		this.state = state;
	}
	
	public void alert()
	{
		state.statechange(this);
	}
}
