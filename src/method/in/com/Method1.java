package method.in.com;

public class Method1 {
	public void subtraction(int a, int b)
	{
		System.out.println("subtraction of " + a + " & " + b + " : " +(a-b));
	}
	public void multiplication(int n, int m)
	{
		System.out.println("multiplication of " + n + " & " + m + " : " +(n*m));
	}
	public void division(int k, int l)
	{
		System.out.println("division of " + k + " to " + l + " : " +(k/l));
	}
	public static void main(String[] args)
	{
		Method1 obj1 = new Method1();
		obj1.subtraction(8,3);
		
				Method1 obj2 = new Method1();
				obj2.multiplication(6,7);

				Method1 obj3 = new Method1();
						obj3.division(8,4);

	}

}
