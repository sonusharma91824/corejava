package MethodOverLoading;

public class OverLoading {
	
	public  void display(String name)
	{
		System.out.println("my name is " + name);
	}
	
	public  void display(int a, int b)
	{
		System.out.println(a+b);
	}

public static void main(String[] args)
{
	OverLoading ov = new OverLoading();
	ov.display("sonu");
	ov.display(5,7);
	}
}
