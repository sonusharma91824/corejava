package array;

public class RemoveDuplicatesFromsTheArray {
    public static void main(String[] args) {


        int a[] = {12, 3,2,4, 345, 66, 2, 43, 243, 345, 12, 66};
        for (int i = 0; i < a.length;i++ )
        {
            for (int j =i+1;j<a.length;j++)
            {
                  if (a[i]==a[j])
                  {
                      System.out.println(a[i]);
                  }
            }
        }
    }
}
