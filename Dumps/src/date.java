
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*Two dates are given as input in "yyyy-MM-dd" format. 
Find the number of months between the two dates*/
public class date {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String s = sc.next();
String s1 = sc.next();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
Date d = sdf.parse(s);
SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
Date d1 =   sdf.parse(s1);
Calendar cal = Calendar.getInstance();
cal.setTime(d);
Calendar cal1 = Calendar.getInstance();
cal1.setTime(d1);
int y1= cal.get(Calendar.YEAR);
int y2 = cal1.get(Calendar.YEAR);
int m1= cal.get(Calendar.MONTH);
int m2= cal1.get(Calendar.MONTH);
int res = Math.abs((m2-m1)+(y2-y1)*12);
System.out.println(res);














		
		
		
	}

}
