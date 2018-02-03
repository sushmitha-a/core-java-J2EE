import java.util.Scanner;
import java.util.StringTokenizer;


public class Largestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String s11="";
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			int m=s1.length();
			if(m>max)
			{
				max=m;
				s11=s1;
			}
			
			
			
		}
		System.out.println(s11);
	}

}
