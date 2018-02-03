import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Largest Span

Write a program to read a integer array, find the largest span in the array.
Span is the count of all the elements between two repeating elements including the repeated
 elements.
Include a class UserMainCode with a static method getLargestSpan which accepts the integer array.
 The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method
 present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.*/
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int n=Integer.parseInt(br.readLine());
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
			int result=UserMainCode7.getLargestSpan(a);
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
