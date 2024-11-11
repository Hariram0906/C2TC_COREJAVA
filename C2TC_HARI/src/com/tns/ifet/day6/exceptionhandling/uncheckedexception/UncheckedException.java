package com.tns.ifet.day6.exceptionhandling.uncheckedexception;

public class UncheckedException {

	public static void main(String[] args) {
		int x[];
		try {
			x = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			System.out.println(x[5]);// out of bound
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist. " + e.getMessage());// to get the detail message of																				// exception as a string value.

		}
	}

}
