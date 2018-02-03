import java.util.Scanner;
import java.util.StringTokenizer;


public class capitalcase {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String S = sc.nextLine();
	StringTokenizer st= new StringTokenizer(S," ");
	StringBuffer sb = new StringBuffer();
	while(st.hasMoreTokens())
	{
		String s1 = st.nextToken();
		sb.append(s1.substring(0,1).toUpperCase());
		sb.append(s1.substring(1));
		sb.append(" ");
		
	}
	System.out.println(sb.toString());
}
}
