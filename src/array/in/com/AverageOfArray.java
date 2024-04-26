package array;

public class AverageOfArray {
    public static void main(String[] args) {
        int a[] = {6,3,6,8,3,8,4};
        int sum=0;
          for (int i=0;i<a.length;i++)
          {
              sum= sum+a[i];
          }
        System.out.println(sum);

          // now we will find the average of array

       double average =(double) sum/a.length;
        System.out.println(average);

    }
}
