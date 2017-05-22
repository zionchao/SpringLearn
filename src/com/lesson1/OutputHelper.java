package com.lesson1;

public class OutputHelper {
	IOutputGenerator outputGenerator;
	
	public void generatorOutput(){
		outputGenerator.generateOutput();
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator=outputGenerator;
	}

}
