/*Given a method with a date string in format dd/mm/yyyy.
Write code to validate the given date against the given formate.
if it is a valid date return 1 else return -1.*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class date1 {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	if(s.matches("[0-9]{2}( )[0-9]{2}(/)[0-9]{4}"))
			{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	sdf.setLenient(false);
	try
	{
		Date d  =sdf.parse(s);
		System.out.println("1");
	}
	catch(ParseException p)
	{
		System.out.println("-1");
	}
			}
	
	else 
		System.out.println("-1");
}
}
