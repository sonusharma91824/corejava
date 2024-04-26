package array;

public class SecondLaegestElement {
    public static void main(String[] args) {
//        int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
//           int tmp =0;
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = i + 1; j < arr.length; j++)
//            {
//                if (arr[i] > arr[j])
//                {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//            System.out.print(arr[i]+",");
//        }


        int array[] =new int[] {3,5,9,2,6,7,8};
        int temp;

        for (int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }




    }
}
