import java.util.Scanner;

/*Write a method that takes a string and returns the number of unique characters in the string. 
If the given string does not contain any unique characters return _1.*/
public class stringbuffer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		int n = sb.length();
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					count++;
				    n--;
				    
				    j--;
				    
				}
			}
			if(count>0)
			{
				sb.deleteCharAt(i);
			   n--;
			   i--;
			}		}
		String s5= sb.toString();
		System.out.println(s5);
		System.out.println(s5.length());
	}

}
