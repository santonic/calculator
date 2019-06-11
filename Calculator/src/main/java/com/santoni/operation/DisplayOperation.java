package com.santoni.operation;

import java.io.OutputStream;
import java.io.PrintStream;

public class DisplayOperation implements Operation {

	private PrintStream out;

	public DisplayOperation(OutputStream out) {
		this.out = new PrintStream(out);
	}

	@Override
	public int operate(Integer current, Integer... operands) {
		out.println(current);
		return current;
	}

}
