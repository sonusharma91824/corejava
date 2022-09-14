package sonu.in.com;

public final class Palindrome {
	public static void main(String[] args) {
		int a = 121;
		int remainder;
		int sum = 0;
		int b = a;

		while (a > 0) {

			remainder = a % 10; // 1,2,1
			sum = sum * 10 + remainder; // 1,12,121
			a = a / 10; // 12,1

		}
		System.out.println(b);
		System.out.println(sum);
		if (sum == b) {
			System.out.println(b + "is palindrome number");

		} else {
			System.out.println(b + "is not palindrome number");
		}

	}

}
