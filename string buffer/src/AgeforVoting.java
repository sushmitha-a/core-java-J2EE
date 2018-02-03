import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class AgeforVoting {
public static  void main (String[] args) throws ParseException
{
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	Calendar cal= Calendar.getInstance();
	cal.setTime(d);
	int y = cal.get(Calendar.YEAR);
	
			
	if(y>=18)
	{
		System.out.println("eligible");
	}
	else
		System.out.println("not eligible");
}
}
