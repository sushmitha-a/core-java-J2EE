import java.text.ParseException;
import java.util.Scanner;

/*Write a program to read Date of Joining and current date as Strings and Experience as integer
 *  and validate whether the given experience and calculated experience are the same. 
 *  Print “true” if same, else “false”.

 
Include a class UserMainCode with a static method calculateExperience which accepts 2 strings 
and an integer. The return type is boolean.
Create a Class Main which would be used to accept 2 string (dates) and an integer and call 
the static method present in UserMainCode.
Input and Output Format:
Input consists of 2 strings and an integer, where the 2 strings corresponds to the date of 
joining and current date, and the integer is the experience.
Output is either “true” or “false”.
Refer sample output for formatting specifications.*/
 
public class Main5 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int exp;        
	        String startDate,curDate;
	        startDate=sc.nextLine();
	        curDate=sc.nextLine();
	        exp=sc.nextInt();
	        System.out.println(UserMainCode5.calculateExperience(startDate,curDate,exp));
		
		
		
		
	}

}
