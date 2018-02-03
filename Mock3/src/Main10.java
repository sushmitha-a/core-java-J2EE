import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Given a string (s) apply the following rules.
1. String should not begin with a number.
If the condition is satisfied then print TRUE else print FALSE.
Include a class UserMainCode with a static method validateString which accepts the string.
The return type is the boolean formed based on rules.
Create a Class Main which would be used to accept the string and call the static method present
in UserMainCode.*/

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			word=br.readLine();
			boolean result=UserMainCode10.validateString(word);
			if(result)
			{
				System.out.println("TRUE");
			}
			else
			{
				System.out.println("FALSE");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
		
	}


