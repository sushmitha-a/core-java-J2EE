import java.util.Scanner;

/*Given a method with pan card no as string input .Write code to validate PAN no against following rules:
			1)there must be 8 characters
			2)first 3 letters must be alphabets followed by 4 digit number and ends with alphabet.
			3)all alphabets should be in capital case
			If pan card no is valid return 1as output else return 2 as output*/
public class regexprsns {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
	{
		System.out.println("1");
	}
	
	else
		System.out.println("2");
	
	
	
	}
}
