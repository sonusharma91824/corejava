package sonu.in.com;

public class SortingOfArray {
	public static void main(String[] args) {
		int temp = 0;
		int c[] = { 7, 2, 9, 5, 4, 0, 11, 1 };
		for (int i = 0; i <= c.length-1; i++) {
			for (int j = i + 1; j <= c.length-1; j++) {
				if (c[i] > c[j]) {
					temp = c[i]; //temp = 7,
					c[i] = c[j]; //c[i] = 2,
					c[j] = temp; //c[j] = 7,
				}
			}
			System.out.println(c[i]);
		}

	}

}
