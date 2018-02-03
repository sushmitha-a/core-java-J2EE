
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Stringprocessing {
public static void main(String []args) throws ParseException
{
	Scanner sc= new Scanner(System.in);
	String s = sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	Date d =sdf.parse(s);
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
    int y = cal.get(Calendar.YEAR);
    int m = cal.get(Calendar.MONTH);
    GregorianCalendar gc = new GregorianCalendar(y,m,1);
    int day = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println(day);
}
}
