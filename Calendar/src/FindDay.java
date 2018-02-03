
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class FindDay {
public static void main(String[] args) throws ParseException
{
	Scanner sc= new Scanner(System.in);
	String s = sc.next();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	try
	{
	
Date d= sdf.parse(s);
System.out.println(d);
	}
	catch(Exception e )
	{
		System.out.println("Format not valid");
	}
}
}
