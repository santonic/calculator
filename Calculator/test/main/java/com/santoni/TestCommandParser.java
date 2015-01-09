package com.santoni;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

 
public class TestCommandParser {

	CommandParser parser;
	
	@Before
	public void init() {
		parser = new CommandParser();
	}
	
	@Test
	public void testCommandWithNoParam() {
		assertThat(parser.parseCommand("NOPARAM"), is(equalTo(new Command("NOPARAM"))));
	}
	

	@Test
	public void testCommandWithNoSpaceInOperator() {
		assertThat(parser.parseCommand("FOO 2"), is(equalTo(new Command("FOO",2))));
	}
	


	@Test
	public void testCommandWithSpaceInOperator() {
		assertThat(parser.parseCommand("FOO BAR 2"), is(equalTo(new Command("FOO BAR",2))));
	}
	

	@Test
	public void testCommandWithSpaceInOperatorAndTwoOperands() {
		assertThat(parser.parseCommand("FOO BAR 2 4"), is(equalTo(new Command("FOO BAR",2,4))));
	}
	
}
