package com.santoni;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.santoni.operation.Operation;

public class TestCalculator {
	Calculator calculator;
	
	@Mock
	CommandParser commandParser;

	private Map<String, Operation> operations; 
	
	@Before
	public void initCalculette() {
		MockitoAnnotations.initMocks(this); 
		operations = new HashMap<String, Operation>();
		
		calculator = new Calculator(commandParser, operations);
		
	}
	
	@Test
	public void testExistingCommand(){
		when(commandParser.parseCommand(anyString())).thenReturn(new Command("COMMAND", 2, 3));
		Operation command = mock(Operation.class);
		when(command.operate(0,2,3)).thenReturn(10);
		operations.put("COMMAND", command);

		int result = calculator.run("COMMAND 2 3");

		Assert.assertEquals(10, result);
	}


	@Test(expected=IllegalArgumentException.class)
	public void testInvalidCommand(){
		when(commandParser.parseCommand(anyString())).thenReturn(new Command("WRONG"));
		
		calculator.run("WRONG");
		
	}

}
