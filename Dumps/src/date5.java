/*Given a method with a date string in the format dd/mm/yyyy.
Write code to convert the given date to the format dd-mm-yy.*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class date5 {
	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse(s);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		String s1 = sdf1.format(d);
		System.out.println(s1);
			
	}
}
