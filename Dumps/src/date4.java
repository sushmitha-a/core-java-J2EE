
/*accept a string and find if it is of date format "dd/mm/yyyy".*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class date4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		
		if(s.matches("[0-9]{2}(/)[0-9]{2}(/)[0-9]{4}"))
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
         try
		{
			Date d = sdf.parse(s);
            System.out.println("valid");
		
		}
		catch(ParseException p)
		{
			System.out.println("invalid");
		}
		
		
	}
		
	}
}