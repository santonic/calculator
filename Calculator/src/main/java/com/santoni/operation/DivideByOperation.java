package com.santoni.operation;

public class DivideByOperation implements Operation {

	@Override
	public int operate(Integer current, Integer... operands) {
		if(operands[0]==0) throw new IllegalArgumentException("divide by 0 not authorized");
		return current/operands[0];
	}

}
