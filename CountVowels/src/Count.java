import java.util.Scanner;


public class Count {
	public static void main(String []args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1= s.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			char c =s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
	System.out.println(count);	
	}
  
}
