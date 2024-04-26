package array;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        {
            int array[] = new int [5];
            for (int i = 5; i > 0; i--)
                array[5-i] = i;
            Arrays.fill(array, 1, 3, 99);
            for (int i = 0; i < 5 ; i++)
                System.out.print(array[i]);
        }
        {
            String ARR [] = {"sonu","khushi","madhav","mona"};
            Arrays.fill(ARR,2,3,"RAHUL");
            System.out.println(Arrays.toString(ARR));

        }

        {
            int[] array = new int[5];
            Arrays.fill(array, 1, 4, 8);

            System.out.println(Arrays.toString(array)); // Output: [0, 8, 8, 8, 0]
        }
    }
        }


