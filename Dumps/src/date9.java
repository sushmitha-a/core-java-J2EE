import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*months between two datess1.pa*/
public class date9 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String s  = sc.next();
		String s1 = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf1.parse(s1);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		int m1=cal.get(Calendar.MONTH);
		int y1=cal.get(Calendar.YEAR);
		int m2=cal1.get(Calendar.MONTH);
        int y2=cal1.get(Calendar.YEAR);
		int no= Math.abs((m2-m1)+(y2-y1)*12);
		System.out.println(no);
		
		
	}

}
