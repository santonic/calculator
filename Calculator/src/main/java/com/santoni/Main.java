package com.santoni;

public class Main {

	public static void main(String[] args) {

        Calculator calculator = new Calculator();
		
		calculator.run("ADD 10");
		calculator.run("DISPLAY");
		
		calculator.run("SUBSTRACT 1");
		calculator.run("DISPLAY");

		calculator.run("DIVIDE BY 3");
		calculator.run("DISPLAY");
		
		calculator.run("MULTIPLY BY 4");
		calculator.run("DISPLAY");
		
		calculator.run("ADD 6 7");
		calculator.run("DISPLAY");
	}

}
