package Inheritance.hierarchical;

public class Circle1 extends ShapeInner1 {
    private double radius;
    
    public void getRadius()
    {
    	System.out.println( " given radius is " +(radius));
    }
    public void setRadius(double radius)
    {
    	this.radius=radius;
    }
    public void areaOfCircle()
    {
    	System.out.println("area of circle is "+ (3.14*radius*radius));
    }

}
