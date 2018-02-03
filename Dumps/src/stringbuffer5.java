import java.util.Scanner;
import java.util.StringTokenizer;

/*Given a method with a 10 digit positive number in the format xxx-xxx-xxxx as string
input. Write code to convert this number to the format xx-xx-xxx-xxx. Return the new
number as output.*/
public class stringbuffer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringTokenizer st = new StringTokenizer(s,"-");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		StringBuffer sb = new StringBuffer();
		sb.append(s1.substring(0,2));
		sb.append("-");
		sb.append(s2.substring(2));
		sb.append(s2.substring(0,1));
		sb.append("-");
		sb.append(s2.substring(1));
		sb.append(s3.substring(0, 1));
		sb.append("-");
		sb.append(s3.substring(1));
		System.out.println(sb.toString());
	}

}
