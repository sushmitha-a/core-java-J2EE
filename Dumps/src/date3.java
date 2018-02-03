/*Given a method with a date string in dd/mm/yyy format.Write code to calculate the day which
falls on the same date next year and return it as outputNote-return 
the output in small case.*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class date3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     
     Date d = sdf.parse(s);
     Calendar cal = Calendar.getInstance();
     cal.setTime(d);
     cal.add(Calendar.YEAR,1);
     Date d2 = cal.getTime();
     SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
     String s1=sdf1.format(d2);
     System.out.println(s1);

	}}
