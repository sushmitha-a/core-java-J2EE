import java.util.*;

/*Given a method with a string,startindex and length.write code to extract substring from right 
 * to left.Assume 
 *the last character has index0.
 */
public class arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		int f1= sc.nextInt();
		int f2 = sc.nextInt();
        String s2 = sb.substring(f1,f1+f2);
        System.out.println(s2);
		
	}

}
