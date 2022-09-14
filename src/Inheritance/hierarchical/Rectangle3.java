package Inheritance.hierarchical;


public class Rectangle3 extends ShapeInner1 {
	private int length;
	private int breadth;
	
	public void getL() {
		System.out.println(" lenght : "+ length);
	}
	public void setL(int lenght)
	{
		this.length=length;
	}
	public void getB()
	{
		System.out.println("breadth : " + breadth);
	}
	public void setB(int breadth)
	{
		this.breadth=breadth;
	}
	public void areaOfReactangle()
	{
		System.out.println("area of reactangle is " +(length*breadth));
	}

}
