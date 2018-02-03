import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class DateDiff {
public static void main(String[] args) throws ParseException
{
	Scanner sc=new Scanner(System.in);
	String s1 = sc.next();
	String s2 = sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date d1= sdf.parse(s1);
	Date d2= sdf.parse(s2);
	Calendar cal = Calendar.getInstance();
	cal.setTime(d1);
	int y1= cal.get(Calendar.YEAR);
	int m1= cal.get(Calendar.MONTH);
	cal.setTime(d2);
	int y2= cal.get(Calendar.YEAR);
	int m2 = cal.get(Calendar.MONTH);
    int res = (m2-m1)+(y2-y1)*12;
    System.out.println(res);
}
}
