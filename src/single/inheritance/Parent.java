package single.inheritance;

public class Parent {
	
	protected int minu;
	protected int sum;
	
	
	public void getMinu()
	{
		System.out.println(minu);
	}
    public void setMinu(int minu )
    {
    	this.minu=minu;
    }
    public void getSum()
    {
    	System.out.println(sum);
    }
    public void setSum(int sum)
    {
    	this.sum=sum;
    }
    
    public void math()
    {
    	System.out.println(minu + sum);
    }
		
	}
    
