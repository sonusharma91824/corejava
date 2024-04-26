package array;

import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9, 10, 11, 12};

        int c[] = new int[a.length + b.length];

        int j=0;
           for (int i=0;i<a.length;i++)
            {
             c[i]=a[i];
            }
        for (int i=0;i<b.length;i++)
          {
            c[a.length+i]= b[i];
          }
        for (int i=0;i<c.length;i++)
        {
            j=j+c[i];
        }
        System.out.println(Arrays.toString(c));
        System.out.println(j);

    }
}