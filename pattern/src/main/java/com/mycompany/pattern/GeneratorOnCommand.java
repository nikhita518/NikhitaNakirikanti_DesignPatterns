package com.mycompany.pattern;

public class GeneratorOnCommand implements Command
{
	Generator generator;
	
	public GeneratorOnCommand(Generator gene)
	{
		this.generator = gene;
	}

	@Override
	public void execute() 
	{
		generator.on();
	}
	
	
}
