package com.mycompany.pattern;

public class GenratorService implements Command
{
	Generator generator;
	
	public GenratorService(Generator gene)
	{
		this.generator = gene;
	}

	@Override
	public void execute() 
	{
		generator.service();
	}
}
