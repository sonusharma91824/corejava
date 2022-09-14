package array.in.com;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		

	{	
		int c[]= {1,5,2,6,3,7,8};
		int temp=0;
		
		for(int i=0;i<=c.length-1;i++)
		{
		for(int j=i+1;j<=c.length-1;j++)
		{
			if(c[i]>c[j])
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
        System.out.println(c[i]);
	
	    }
	}

}
}