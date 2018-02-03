import java.util.Scanner;
import java.util.StringTokenizer;


/*52) Given method taking a sentence in string variable.Write code tio convert the first letter of each word to capital case and return the final String.
Note- only the first letter in each word should be in capital case in return string.
Example-
INPUT- "Now is the time to act!"
OUPUT-"Now Is The Time To Act!"*/
public class stringbuffer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			
		    String s2 = s1.toUpperCase();
		    char c = s2.charAt(0);
			sb.append(c);
			
			sb.append(s1.substring(1));
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}

}
