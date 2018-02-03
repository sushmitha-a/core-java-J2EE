/*Given a String , write a program to find whether it is a valid password or not.
 
Validation Rule:
Atleast 8 characters
Atleast 1 number(1,2,3...)
Atleast 1 special character(@,#,%...)
Atleast 1 alphabet(a,B...)
 */
import java.util.*;
public class psswdvldtn {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a1 = "(.*)[0-9](.*)";
		String a2 = "(.*)[@|#|%](.*)";
		String a3 = "(.*)[A-Za-z](.*)";
		if(s.matches(a1)&&s.matches(a2)&&s.matches(a3)&&s.length()>=8)
		{
			System.out.println("valid");
		}
		else 
			System.out.println("invalid");
		}
}
