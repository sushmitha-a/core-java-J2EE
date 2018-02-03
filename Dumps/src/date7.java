
/* Given date in dd-MM-yyyy format.return the month in full name format(January)*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class date7 {
public static void main(String[]args) throws ParseException
{
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yyyy");
	Date d = sdf.parse(s);
	SimpleDateFormat sdf1  = new SimpleDateFormat("MMMM");
	String s1= sdf1.format(d);
	System.out.println(s1);
}
}
