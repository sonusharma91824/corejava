package sonu.in.com;

public class Array {
	public static void main(String[] args) {
		int[][] c = new int[11][11];

		for (int i = 1; i < c.length; i++) {
			for (int k = 1; k < c.length; k++) {
				c[i][k] = i * k;
				System.out.print(c[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
