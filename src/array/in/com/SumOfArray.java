package array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int j=0;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            j=j+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum of the array's element is " + j);




    }
}
