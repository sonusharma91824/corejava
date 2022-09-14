package string.in.com;

public class StringInitilization {
	public static void main(String[] args) {
		{
		String s1= "ring";
		String s2 = "ring";
		 boolean  tem = (s1==s2);
				 System.out.println(tem);
		}		
		{
			String s3 = new String ("ring");
			String s4 = new String ("ring");
			boolean temp =(s3.equals(s4));
			System.out.println(temp);
		}
	
		
	}

}
