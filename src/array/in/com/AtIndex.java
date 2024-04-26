package array;

public class AtIndex {
    public static void main(String[] args) {
        int a[] = {6, 3, 6, 8, 3, 8, 4};
        for (int i=0; i<a.length;i++)
        {
            if(i == 2)
            {
                System.out.println(a[i]);
            }
        }

    }
}