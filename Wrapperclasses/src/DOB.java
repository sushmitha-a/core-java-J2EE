import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DOB {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
    if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
    {
    	SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
    	sdf.setLenient(false);
    	try{
    		Date d = sdf.parse(s);
    		System.out.println("true");
    	}
    	catch(ParseException e )
    	{
    		System.out.println("false");
    	}
    }
    else{
    	System.out.println("false");
    }
}
}
