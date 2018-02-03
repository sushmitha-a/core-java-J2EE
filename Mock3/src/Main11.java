import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


public class Main11 {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
	     String inputString = br.readLine(); 
	     System.out.println(UserMainCode11.convertDateFormat(inputString));
	}

}
