import java.text.ParseException;
import java.util.Scanner;
import java.util.*;

public class stringbuffer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.next();
if(s.charAt(0)=='-')
{
	String s1 = s.substring(1);
	try{
		
		int a = Integer.parseInt(s1);
		System.out.println("1");
         }
	catch(Exception e)
	{
		System.out.println("-1");
	}
}else
System.out.println("-1");
}






	}


