

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;
	import java.util.Scanner;

	public class noofdays {

	public static void main(String []args) throws ParseException
	{
		Scanner sc= new Scanner(System.in);
		int s1= sc.nextInt();
		int s2= sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		GregorianCalendar gc = new GregorianCalendar(s1,s2,1);
		int n = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		System.out.println(n);
	}
	}


