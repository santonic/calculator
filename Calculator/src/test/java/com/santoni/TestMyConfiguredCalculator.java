package com.santoni;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;

public class TestMyConfiguredCalculator {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    MyConfiguredCalculator calc;

    @Before
    public void resetCalc(){
        calc = new MyConfiguredCalculator(outputStream);
    }

    @Test
    public void DISPLAY_should_display_zero_on_first_call(){
        calc.run("DISPLAY");

        assertEquals("0\n", outputStream.toString());
    }

    @Test
    public void DISPLAY_should_display_the_current_value(){
        calc.run("ADD 3");
        calc.run("DISPLAY");

        assertEquals("3\n", outputStream.toString());
    }

    @Test
    public void ADD_returns_the_updated_value(){
        Integer current = calc.run("ADD 3");

        assertEquals(Integer.valueOf(3), current);
    }

    @Test
    public void ADD_returns_the_updated_value_with_two_operands(){
        Integer current = calc.run("ADD 3 5");

        assertEquals(Integer.valueOf(8), current);
    }

    @Test
    public void SUBSTRACT_returns_the_updated_value(){
        Integer current = calc.run("SUBSTRACT 3");

        assertEquals(Integer.valueOf(-3), current);
    }

    @Test
    public void DIVIDE_returns_the_updated_value(){
        // arrange
        calc.run("ADD 12");
        // act
        Integer current = calc.run("DIVIDE BY 3");
        // assert
        assertEquals(Integer.valueOf(4), current);
    }

    @Test
    public void MULTIPLY_returns_the_updated_value(){
        // arrange
        calc.run("ADD 2");
        // act
        Integer current = calc.run("MULTIPLY BY 6");
        // assert
        assertEquals(Integer.valueOf(12), current);
    }
}