package sonu.in.com;

public class TwoDArray {
	public static void main(String[] args) {
		int d[][]= new int[2][3];
		d[0][0]=1;
		d[0][1]=2;
		d[0][2]=3;

		d[1][0]=5;
		d[1][1]=6;
		d[1][2]=7;
		
     
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d.length+1;j++)
		{
		System.out.print(d[i][j] + "\t");	
		}System.out.println("\n");
		}
	}

}
