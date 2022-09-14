package date.in.com;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Date3 {
	public static void main(String[] args) {
		Date d2 = new Date();
		System.out.println(d2);
		
		SimpleDateFormat s2 = new SimpleDateFormat("YY/MM/dd");
		System.out.println(s2.format(d2));
		
		String s3 ="3/5/2011";
		Date d3 = new Date(s3);
		System.out.println(d3);
		
		
	}

}