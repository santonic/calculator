package com.santoni;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;


public class Calculator {
	int current;

	public Calculator() {
	}

	public int run(String commandLine) {
	    // parse command Line
        StringBuilder operatorSB = new StringBuilder();
        List<Integer> operands = new ArrayList<Integer>();
        StringTokenizer stringTokenizer = new StringTokenizer(commandLine);

        while (stringTokenizer.hasMoreTokens()) {
            String token = (String) stringTokenizer.nextToken();
            if (StringUtils.isAlpha(token)) {
                operatorSB.append(" " + token);
            } else {
                operands.add(Integer.valueOf(token));
            }
        }
        String operator = operatorSB.substring(1);

        // run operation
		switch (operator){
            case "DISPLAY":
                System.out.println((Integer) current);
                break;
            case "ADD":
                for (Integer operand : operands) {
                    current += operand;
                }
                break;
            case "SUBSTRACT":
                current = (Integer) current - operands.get(0);
                break;
            case "DIVIDE BY":
                if(operands.get(0)==0) throw new IllegalArgumentException("divide by 0 not authorized");
                current = (Integer) current / operands.get(0);
                break;
            case "MULTIPLY BY":
                current = (Integer) current * operands.get(0);
                break;
            default:
                throw new IllegalArgumentException("unexpected operator: "+operator);
        }

        return current;
	}
	
	

}
