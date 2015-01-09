package com.santoni;

import java.util.Map;

import com.santoni.operation.Operation;


public class Calculator {

	private CommandParser commandParser;

	private Map<String, Operation> operations;

	int current;

	public Calculator(CommandParser commandParser, Map<String, Operation> operations) {
		this.commandParser = commandParser;
		this.operations = operations;
	}

	public Integer run(String commandLine) {
		Command command = commandParser.parseCommand(commandLine);
		Operation operation = operations.get(command.getOperator());

		if(operation!=null){
			current = operation.operate(current, command.getOperands());
			return current;
		} else {
			throw new IllegalArgumentException("unexpected operator: "+command.getOperator());
		}
	}
	
	

}
