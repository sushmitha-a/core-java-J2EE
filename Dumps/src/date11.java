
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class date11 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2 = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date d = sdf.parse(s1);
		System.out.println(d);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		Date d1 = sdf1.parse(s2);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		int y1 = cal.get(Calendar.HOUR_OF_DAY);
		int m1 = cal .get(Calendar.MINUTE);
		int se1 = cal.get(Calendar.SECOND);
		int y2 = cal1.get(Calendar.HOUR_OF_DAY);
		int m2 = cal1.get(Calendar.MINUTE);
		int se2 = cal1.get(Calendar.SECOND);
		int m = m1+m2;
		int y = y1+y2;
		int se = se1+se2;
		int day=0;
		if(se>60)
		{
		    m=m+1;
		    se=se-60;
		    
		}
       if(m>60)
       {
    	   y=y+1;
    	   m=m-60;
       }
		if(y>24)
		{
			day=day+1;
			y=y-24;
		}
		
		StringBuffer sb= new StringBuffer();
		sb.append(day).append(":").append(y).append(":").append(m).append(":").append(se);
		System.out.println(sb.toString());
		
		
	}

}
