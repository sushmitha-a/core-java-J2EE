import java.util.Scanner;


public class appnd {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String s1= sc.next();
	String s2= sc.next();
	StringBuffer sb= new StringBuffer();
	sb.append(s1.substring(s1.length()-s2.length()));
	sb.append(s2);
	System.out.println(sb);
}
}
