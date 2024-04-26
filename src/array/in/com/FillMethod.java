package array.ArraysMethods;

import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
       int  Arras[] = new int[4];
       int sum=0;
           Arrays.fill(Arras,5);
        System.out.println(Arrays.toString(Arras));
        for (int i=0;i<Arras.length;i++) {
            sum=sum+Arras[i];
        }
        System.out.println(sum);
     }
}
