package Multilevel.inheritance;

public class TestClass {
	public static void main(String[] args)
	{
		ParentClass pa = new ChildClass3();
		System.out.println("parent class : "+(pa.par()));
		
		
		ChildClass1 c1 = new ChildClass1();
        System.out.println("child 1 : "+(c1.child1()));
        
        
		ChildClass2 c2 = new ChildClass2();
        System.out.println("child 2 : "+(c2.child2()));
        
        
		ChildClass3 c3 = new ChildClass3();
        System.out.println("child 3 : "+(c3.child3()));
    }
	
}
