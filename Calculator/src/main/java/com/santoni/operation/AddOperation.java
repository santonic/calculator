package com.santoni.operation;


public class AddOperation implements Operation {

	@Override
	public int operate(Integer current, Integer... operands) {
		int res= current ;
		for (Integer operand : operands) {
			res += operand;
		}
		
		return res;
	}

}
