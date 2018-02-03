import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a Program that accepts three integer values (a,b,c) and returns their sum. However, 
if one of the values is 13 then it does not count towards the sum and the next number also does
not count. So for example, if b is 13, then both b and c do not count.

Include a class UserMainCode with a static method getLuckySum which accepts three integers. 
The return type is integer representing the sum.*/
public class Main1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int input1,input2,input3;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    input1=Integer.parseInt(br.readLine());
	    input2=Integer.parseInt(br.readLine());
	    input3=Integer.parseInt(br.readLine());
	    System.out.println(UserMainCode1.getLuckySum(input1, input2, input3));

	    
	}

}
