package com.santoni;

import java.util.Arrays;

public class Command {
	String operator;
	public Integer[] getOperands() {
		return operands;
	}

	private Integer[] operands;
	
	public Command() {
	}

	public String getOperator() {
		return operator;
	}

	public Command(String operator, Integer... operands) {
		super();
		this.operator = operator;
		this.operands = operands;
	}

	public Command(String operator) {
		super();
		this.operator = operator;
		this.operands = new Integer[]{};
	}
	
	@Override
	public String toString() {
		StringBuilder toStringBuilder = new StringBuilder("Command("+operator+")");
		if(operands!=null){
			toStringBuilder.append(",");
			for (int i = 0; i < operands.length; i++) {
				toStringBuilder.append(" "+operands[i]);	
			}
		}
		toStringBuilder.append(")");
		return toStringBuilder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(operands);
		result = prime * result
				+ ((operator == null) ? 0 : operator.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Command other = (Command) obj;
		if (!Arrays.equals(operands, other.operands))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		return true;
	}

	
}
