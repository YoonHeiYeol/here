package com.varhere.yoon008;

public class AddArguments2 {
	public static void main(String[] args) {
		try {
			int sum = 0;
			for ( String arg : args ) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe) {
			System.err.println("one of the command-line"
					+ "arguments is not an ineger.");
			
		}
	}
}
