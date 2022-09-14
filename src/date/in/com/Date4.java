package date.in.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date4 {
	public static void main(String[] args)  {

	
Date d1 = new Date();
System.out.println(d1);

SimpleDateFormat std = new SimpleDateFormat("dd/MM/yy");
System.out.println(std.format(d1));
	}

}
