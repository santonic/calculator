package com.santoni.operation;


public class SubstractOperation implements Operation {

	@Override
	public int operate(Integer current, Integer... operands) {
		return current - operands[0];
	}

}
