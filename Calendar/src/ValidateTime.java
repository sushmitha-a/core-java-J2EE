import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ValidateTime {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
	sdf.setLenient(false);
	try
	{
	Date d = sdf.parse(s);
	System.out.println("valid time");
	}
	catch(ParseException e)
	{
		System.out.println("invalid time");}
}
	
}
