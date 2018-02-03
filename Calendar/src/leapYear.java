
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class leapYear {
public static void main(String []args) throws ParseException
{
	Scanner sc= new Scanner(System.in);
	String s= sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.YEAR,1);
	Date d1=cal.getTime();
	SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
	String r = sdf1.format(d1);
	System.out.println(r);
}
}

