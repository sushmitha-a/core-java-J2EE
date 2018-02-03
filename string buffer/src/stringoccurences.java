import java.util.Scanner;
import java.util.StringTokenizer;


public class stringoccurences {
public static void main(String []args)
{
	int count=0;
	Scanner sc= new Scanner(System.in);
	String s1= sc.nextLine();
	String s2=sc.nextLine();
	StringTokenizer st2= new StringTokenizer(s2," ");
	String s3=st2.nextToken();
	String s4=st2.nextToken();
	StringTokenizer st1= new StringTokenizer(s1," ");
	while(st1.hasMoreTokens())
	{
		String s5=st1.nextToken();
		if(s5.equals(s4))
		{
			count++;
			
		}
	}
	System.out.println(count);
}
}
