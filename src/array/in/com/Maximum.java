package array;

public class Maximum {
    public static void main(String[] args) {


        int a[] = {6,3,6,8,3,8,4};
           int compare=0;


        for (int i =0;i<a.length;i++)
        {
            if(a[i]>compare)
            {
                compare=a[i];
            }

        }
        System.out.println(compare);

    }
}