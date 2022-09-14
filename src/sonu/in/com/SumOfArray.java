package sonu.in.com;

public class SumOfArray {
	public static void main(String[] args) {
		int [] arr = {9,3,7,1,7,2,8,0};
		int j=0;
		for (int i=0;i<arr.length;i++)
		{
			j=arr[i]+j;
			System.out.println(arr[i]);
			arr[i]=j;	
			
		}
		System.out.println("sum of array.in.com : " + j);
	}

}
 