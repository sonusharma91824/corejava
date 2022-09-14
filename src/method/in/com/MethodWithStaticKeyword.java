package method.in.com;

public class MethodWithStaticKeyword {
	public static int sum(int a , int b)
	{
		return a+b;
	}
 public static void main(String[] args) {	 
	  int n=3;
	  int m=7;
	  
	  int hold = MethodWithStaticKeyword.sum(n,m);
	  System.out.println(hold);  
}
}
