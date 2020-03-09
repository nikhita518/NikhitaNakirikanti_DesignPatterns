package com.mycompany.pattern;

public class GeneratorOffCommand implements Command
{
Generator generator;
	
	public GeneratorOffCommand(Generator gene)
	{
		this.generator = gene;
	}

	@Override
	public void execute() 
	{
		generator.off();
	}
}
