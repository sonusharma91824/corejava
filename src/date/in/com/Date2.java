package date.in.com;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Date2 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yy");
		System.out.println(obj.format(date));		
	}
}
