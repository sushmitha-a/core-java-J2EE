/* Given a methodtaking a person name in the format-"FirstName
lastName".write code to return the person name in the following
formate-"LastName","InitialOfName".*/

import java.util.Scanner;
import java.util.StringTokenizer;


public class Stringbuffer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		String g = st.nextToken();
		String g1 = st.nextToken();
		sb.append(g1);
		sb.append(",");
		sb.append(g.substring(0,1));
        System.out.println(sb.toString());  		
		
	}
}
