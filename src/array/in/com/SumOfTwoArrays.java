package array;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9, 10, 11, 12};
        int c[] = new int[a.length + b.length];
        int j =0;
        for (int i=0;i<a.length;i++)
        {
            c[i]= a[i]+b[i];

            j=c[i]+j;
        }
        System.out.println(j);



    }
}
