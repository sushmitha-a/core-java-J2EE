/*Given a method with a date string as input.write code to validate if the given date is in any of the following formats:
dd.mm.yyyy
dd/mm/yy
dd-mm-yyyy
return 1 if it is a valid date else return-1.*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.next();
if(s.matches("[0-9]{2}(/)[0-9]{2}(/)[0-9]{4}"))
		{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	sdf.setLenient(false);
	try{
		Date d = sdf.parse(s);
		System.out.println("1");
	}
	catch(ParseException  e)
	{
		System.out.println("-1");
	}
		}
	else if(s.matches("[0-9]{2}(-)[0-9]{2}(-)[0-9]{4}"))
		{
		SimpleDateFormat sdf1= new SimpleDateFormat("dd-MM-yyyy");
		sdf1.setLenient(false);
		try{
			Date d1 = sdf1.parse(s);
			System.out.println("1");
		}
		catch(ParseException  e)
		{
			System.out.println("-1");
		}
		}

	else if(s.matches("[0-9]{2}(.)[0-9]{2}(.)[0-9]{4}"))
	{
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
	sdf2.setLenient(false);
	try{
		Date d2 = sdf2.parse(s);
		System.out.println("1");
	}
	catch(ParseException  e)
	{
		System.out.println("-1");
	}
	}
	else
		System.out.println("-1");

		}
	}


