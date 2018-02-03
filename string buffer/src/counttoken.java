import java.util.Scanner;
import java.util.StringTokenizer;


public class counttoken {
	public static void main(String []args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		StringTokenizer st= new StringTokenizer(s1," ");
		while(st.hasMoreTokens())
		{
			st.nextToken();
			count++;
		}
		System.out.println(count);
	}
}
