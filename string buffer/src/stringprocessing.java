import java.util.Scanner;


public class stringprocessing {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	int n=sc.nextInt();
	StringBuffer s2=new StringBuffer();
	String s3= s1.substring(s1.length()-n);
	for(int i=0;i<n;i++)
	{
		s2.append(s3);
	}
	System.out.println(s2);
}
}
