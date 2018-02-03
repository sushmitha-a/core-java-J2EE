import java.util.*;


public class DulicateChars {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();
	String s1= DulicateChars.removedup(s);
	System.out.println(s1);
}
public static String removedup(String s)
{
	
	StringBuffer sb= new StringBuffer();
	LinkedHashSet<Character> lhs= new LinkedHashSet<Character>();
	
	for(int i=0;i<s.length();i++)
	{
		lhs.add(s.charAt(i));
	}
	for(Character c: lhs)
	{
		sb.append(c);
	}
	return sb.toString();
}
}
