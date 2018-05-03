package com.santoni;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void setupCalculator(){
        calculator = new Calculator();
    }


    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCommand() {
        calculator.run("WRONG");
    }

    @Test
    public void testAdd() {
        assertEquals(2, calculator.run("ADD 2"));
    }

    @Test
    public void testAddMultiOperand() {
        // arrange
        calculator.run("ADD 2");
        // act and assert
        assertEquals(7, calculator.run("ADD 2 3"));
    }

    @Test
    public void testSubstract() {
        // arrange
        calculator.run("ADD 2");
        // act and assert
        assertThat(calculator.run("SUBSTRACT 3"), is(equalTo(-1)));
    }

    @Test
    public void testDivideBy() {
        // arrange
        calculator.run("ADD 9");
        // act and assert
        assertThat(calculator.run("DIVIDE BY 3"), is(equalTo(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        // arrange
        calculator.run("ADD 9");
        // act and assert
        calculator.run("DIVIDE BY 0");
    }

    @Test
    public void testMultiplyBy() {
        // arrange
        calculator.run("ADD 9");
        // act and assert
        assertThat(calculator.run("MULTIPLY BY 3"), is(equalTo(27)));
    }

    @Test
    public void testDisplay() { // TODO how !!???
//        PrintStream mockOut = mock(PrintStream.class);
//        new DisplayOperation(mockOut).operate(6);
//        verify(mockOut).println(Integer.valueOf(6));

    }

}
