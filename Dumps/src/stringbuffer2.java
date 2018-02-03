import java.util.Scanner;

/*Given a method with two strings as input.if strings are of some length simply append them 
together 
and return the final.if given strings are of different lenght,remove starting characters from
		the ponger string so 
		that both string are of length then append them together and return the final string.
*/public class stringbuffer2 {
public static void main(String[]args)
{
	StringBuffer sb = new StringBuffer();
	Scanner sc= new Scanner(System.in);
	String s = sc.next();
	String s1 = sc.next();
	if(s.length()==s1.length())
	{
		sb.append(s);
		sb.append(s1);
	}
	else if(s.length()>s1.length())
	{
		int i1 = s.length();
		sb.append(s.substring(s.length()-s1.length()));		
		sb.append(s1);
	}
	else if(s.length()<s1.length())
	{
		int i1 = s.length();
		sb.append(s1.substring(s1.length()-s.length()));		
		sb.append(s);
	}
 System.out.println(sb.toString());
	
}
}
