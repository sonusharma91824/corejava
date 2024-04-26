package array;

import java.util.Arrays;

public class FindSameElementsInTheArrays {
    public static void main(String[] args) {
        String stg[] = new String[]{"a","b","a","d","b","e"};
  for (int i=0;i<stg.length;i++)
  {
      for (int j=i+1;j<stg.length;j++)
      {
          if(stg[i]==stg[j])
          {
              System.out.println(stg[i]);
          }
      }
  }
    }
}
