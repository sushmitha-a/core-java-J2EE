/*Find the number of days between two input dates.*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class date8 {
	public static void main(String[]args) throws ParseException{
		
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		String s1= sc.next();
		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		long  l1 = cal.getTimeInMillis();
		Date d1 =sdf.parse(s1);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
	    long l2 = cal1.getTimeInMillis();		
		int da = Math.abs((int)((l2-l1)/(1000*3600*24*12)));
	    System.out.println(da);
	    
	    
		}
		}	
		
		
		


