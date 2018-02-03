import java.util.Scanner;

/*Write code to get the sum of all the digits present in the given string.
 
Include a class UserMainCode with a static method sumOfDigits which accepts string input.
 
Return the sum as output. If there is no digit in the given string return -1 as output.
 
Create a class Main which would get the input and call the 
static method sumOfDigits present in the UserMainCode.*/
 
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        System.out.println(UserMainCode2.sumOfDigits(str));
	}

}
