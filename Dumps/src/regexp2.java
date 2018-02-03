
/*validate the ip address in the form a.b.c.d
where a,b,c,d must be between 0and 255
if validated return 1 else return 2*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class regexp2 {
	public static void main(String[] args) {
    int count=0,c1=0;        	
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	StringTokenizer st = new StringTokenizer(s,".");
	while(st.hasMoreTokens())
	{
	    String s2 = st.nextToken();
		int s3 = Integer.parseInt(s2);
	   if(s3>=0&&s3<=255)
	   {
		   count++;
	   }
	c1++;
	}
	if(count==c1)
	{System.out.println("valid");
	
}
	else
		System.out.println("invalid");
	}
}
	
	

