import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode5 {

	
	    public static boolean calculateExperience
	    (String startDate,String curDate,int exp) throws ParseException{
	    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    	Date d = sdf.parse(startDate);
	    	Calendar cal = Calendar.getInstance();
	    	cal.setTime(d);
	    	
	    	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	    	Date da = sdf1.parse(curDate);
	    	Calendar cal1 = Calendar.getInstance();
	    	cal1.setTime(da);
	    	long l1 = cal.getTimeInMillis();
	        long l2 = cal1.getTimeInMillis();
	        int p  =Math.abs((int)((l1-l2)/(1000*3600*24)));
	    	int exp1=p*365;
	    	if(p>=exp1)
	    		return true;
	    	else
	    		return false;

	}

}
