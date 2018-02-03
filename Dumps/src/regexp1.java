import java.util.Scanner;

/*Given a method with a password in string format as input. Write code to validate the password
using following rules:
-Must contain at least one digit.
- Must contain at least one of the following special characters @,#,$
- Length should be between 6 to 20 characters
-If the password is as per the given rules return 1 else return -1.*/
public class regexp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.matches("(.*)[0-9](.*)(.*)[@|#|$](.*)")&&s.length()>=6&&s.length()<=20)
		{
			System.out.println("valid");
		}
		else
			System.out.println("invalid");
		
}
}