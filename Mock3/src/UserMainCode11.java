import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserMainCode11 {

	public static String convertDateFormat(String inputString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(inputString);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		String s = sdf1.format(d);
		
		return s;
		
		
		
	}

}
