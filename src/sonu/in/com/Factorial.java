package sonu.in.com;

public class Factorial {
	public static void main(String[] args) {

		int f = 1;
		int k = 3;
		for (int i = k; i >= 1; i--) {

			f = i * f;

		}
		System.out.print("Factorial of " + k + " is" + ": " + f);

	}

}

// write a program to find factorial
