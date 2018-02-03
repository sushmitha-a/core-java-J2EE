/*operation-- get the strings from input1 using stringtokenizer
reverse each string
then to lower case
finally store it in output1[] string array*/
import java.util.*;
public class arraylist14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s,s1);
        while(st.hasMoreTokens())
        {
        	sb.append(st.nextToken());
        }
        sb.reverse();
        System.out.println(sb.toString());
        
	}

}
