package Inheritance.hierarchical;

public class TestClass {
	public static void main(String [] args)
	{
	    Circle1 c = new Circle1();
	    Triangle2 t = new Triangle2();
	    Rectangle3 r = new Rectangle3();
	    
	    c.setRadius(7);
	    c.getRadius();
	    c.areaOfCircle();
	    
	    t.setBase(5);
	    t.setHeight(8);
		t.getBase();
		t.getHeight();
		t.areaOfTriangle();
		
	
		r.setL(8);
		r.setB(4);
		r.getB();
		r.getL();
		r.areaOfReactangle();
		
		
		
		
	}
}
