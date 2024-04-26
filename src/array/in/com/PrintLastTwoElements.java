package array;

public class PrintLastTwoElements {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        {
            for (int i = a.length - 1; i >= 8; i--) {
                System.out.println(a[i]);
            }
        }
        {
            for (int i =a.length-2;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }
        {
            int s[] = new int[4];

                for (int i = 0; i < 6; i++) {
                    System.out.println(s[i]);
                }

        }
        {
            for (int i =a.length-2;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
}
