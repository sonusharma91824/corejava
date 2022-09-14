package Inheritance.hierarchical;

public class Triangle2 extends ShapeInner1 {
	private int base ;
	private int height;
	
	public void getBase() {
		System.out.println( " base : "+ base);
	}
    public void setBase(int base)
    {
    	this.base=base;
    }
    public void getHeight()
    {
    	System.out.println("height : " + height);
    }
    public void setHeight(int height) {
      this.height=height;
    }
   public void areaOfTriangle()
   {
	   System.out.println("area of triangle is " +(0.5*base*height));
   }
}
