package sonu.in.com;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstnumber = 0;
		int secondnumber = 1;
		int next;

		for (int a = 1; a <= 10; ++a) {
			next = firstnumber + secondnumber;//1,2

			System.out.print(firstnumber + ",");//0,1
			firstnumber = secondnumber;//1,1
			secondnumber = next;//1,2

		}

	}

}
