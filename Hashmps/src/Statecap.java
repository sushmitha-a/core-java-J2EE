import java.util.HashMap;
import java.util.Scanner;


public class Statecap {
public static void main(String []args)
{
	
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	HashMap<String,String> hm= new HashMap<String,String>();
	for(int i=0;i<n;i++)
	{
		hm.put(sc.next(),sc.next());
	}
	String c= sc.next();
	
	String op=findCaps(hm,c);
	System.out.println(op);
}
public static String findCaps(HashMap<String,String> hm, String c)
{
	String res= hm.get(c)+"$"+c;
	return res.toLowerCase();
}
}
