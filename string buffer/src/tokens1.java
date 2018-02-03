import java.util.Scanner;
import java.util.StringTokenizer;


public class tokens1 {
public static void main(String []args)
{
	Scanner sc= new Scanner(System.in);
	String S= sc.nextLine();
	StringTokenizer st = new StringTokenizer(S," ");
	String s1= st.nextToken();
	String s2=st.nextToken();
	StringBuffer sb = new StringBuffer();
	sb.append(s2.substring(s2.length()-1));
	sb.append(s1.substring(1));
	sb.append(" ");
	sb.append(s2.substring(0,s2.length()-1));
	sb.append(s1.substring(0,1));
	System.out.println(sb.toString());
}
}
