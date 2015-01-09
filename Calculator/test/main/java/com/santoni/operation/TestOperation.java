package com.santoni.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class TestOperation {


	@Test
	public void testAdd(){
		assertThat(new AddOperation().operate(2, 3), is(equalTo(5)));
	}
	

	@Test
	public void testAddMultiOperand(){
		assertThat(new AddOperation().operate(2, 3,4,5), is(equalTo(14)));
	}

	@Test
	public void testSubstract(){
		assertThat(new SubstractOperation().operate(2, 3), is(equalTo(-1)));
	}
	

	@Test
	public void testDivideBy(){
		assertThat(new DivideByOperation().operate(9, 3), is(equalTo(3)));
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void testDivideByZero(){
		new DivideByOperation().operate(9, 0);
	}
	
	@Test
	public void testMultiplyBy(){
		assertThat(new MultiplyByOperation().operate(9, 3), is(equalTo(27)));
	}
}
