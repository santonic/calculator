package com.santoni.operation;

import java.io.PrintStream;

public class DisplayOperation implements Operation {

	private PrintStream out;

	public DisplayOperation(PrintStream out) {
		this.out = out;
	}

	@Override
	public int operate(Integer current, Integer... operands) {
		out.println(current);
		return current;
	}

}
