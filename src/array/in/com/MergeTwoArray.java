package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {

        String a[] =new String[4];
        String b[] =new String[4];
        String c[]= new String[a.length+b.length];

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the elements of the array a ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.next();
            c[i]=a[i];
        }
        System.out.println("enter the elements of the array b ");
        for(int i=0;i<b.length;i++)
        {
          b[i]=sc.next();
          c[a.length+i]=b[i];
        }

        System.out.println("merge both array ");
        System.out.println(Arrays.toString(c));









    }
}
