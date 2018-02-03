import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Write a program to read two strings and checks if one is an anagram of the other.
An anagram is a word or a phrase that can be created by rearranging the letters of another given
word or phrase. We ignore white spaces and letter case. All letters of 'Desperation' can be 
rearranged to the phrase 'A Rope Ends It'.
Include a class UserMainCode with a static method checkAnagram which accepts the two strings.
The return type is boolean which is TRUE / FALSE.
Create a Class Main which would be used to accept the two strings and call the static method 
present in UserMainCode.*/


public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1,input2;
		boolean result;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			input1=br.readLine();
			input2=br.readLine();
			result=UserMainCode8.checkAnagram(input1, input2);
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
