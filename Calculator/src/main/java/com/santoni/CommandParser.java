package com.santoni;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;

public class CommandParser {

	public Command parseCommand(String command) {
		StringBuilder operator = new StringBuilder();
		List<Integer> operands = new ArrayList<Integer>();
		StringTokenizer stringTokenizer = new StringTokenizer(command);

		while (stringTokenizer.hasMoreTokens()) {
			String token = (String) stringTokenizer.nextToken();
			if (StringUtils.isAlpha(token)) {
				operator.append(" " + token);
			} else {
				operands.add(Integer.valueOf(token));
			}
		}

		return new Command(operator.substring(1),
				operands.toArray(new Integer[operands.size()]));

	}
}
