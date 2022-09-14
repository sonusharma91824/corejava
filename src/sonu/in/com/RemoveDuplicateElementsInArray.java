package sonu.in.com;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 1, 1, 1, 6, 7, 6, 6 };
		int temp = 0;
		int c = a[0];
		int[] b = new int[a.length + 1];
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			;
			b[i] = a[i];

		}
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] != b[i + 1]) {
				System.out.println(b[i]);
			}
		}

	}
}
