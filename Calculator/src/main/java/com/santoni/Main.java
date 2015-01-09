package com.santoni;

import java.util.HashMap;
import java.util.Map;

import com.santoni.operation.AddOperation;
import com.santoni.operation.DisplayOperation;
import com.santoni.operation.DivideByOperation;
import com.santoni.operation.MultiplyByOperation;
import com.santoni.operation.Operation;
import com.santoni.operation.SubstractOperation;

public class Main {

	public static void main(String[] args) {

		Calculator calculator = setupCalculator();
		
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

	private static Calculator setupCalculator() {
		Map<String, Operation> operations = new HashMap<String, Operation>();
		operations.put("DISPLAY", new DisplayOperation(System.out));
		operations.put("ADD", new AddOperation());
		operations.put("SUBSTRACT", new SubstractOperation());
		operations.put("DIVIDE BY", new DivideByOperation());
		operations.put("MULTIPLY BY", new MultiplyByOperation());

		Calculator calculator = new Calculator(new CommandParser(), operations);
		return calculator;
	}

}
