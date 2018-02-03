/*.Find the day(Friday) of a date input given as MM-dd-yyyy (format)*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class date6 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date d = sdf.parse(s);
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
		String s1= sdf1.format(d);
		System.out.println(s1);
		
	}

}
