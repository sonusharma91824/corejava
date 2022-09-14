package sonu.in.com;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a=153;
		int n,temp;
		
		for(int i=0;i<=3;i++)
		{
			n=a%10;
		    temp=n*n;
			System.out.println(temp);
			n=a/10;
		}	
			System.out.println();
			
		
	}

}
