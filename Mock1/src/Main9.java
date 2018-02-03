import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Write a program to read two integer array and calculate the symmetric difference of the two 
arrays. Finally Sort the array.
Symmetric difference is the difference of A Union B and A Intersection B ie. [ (A U B) - (A ^ B)]
Union operation merges the two arrays and makes sure that common elements appear only once.
Intersection operation includes common elements from both the arrays.
Ex - A={12,24,7,36,14} and B={11,26,7,14}.
A U B ={ 7,11,12,14,24,26,36} and
A ^ B = {7,14}
Symmetric difference of A and B after sorting= [A U B] - [ A ^ B] = {11,12,24,26,36}.
Include a class UserMainCode with a static method getSymmetricDifference which accepts the 
integer array. The return type is an integer array.
Create a Class Main which would be used to accept the two integer arrays and call the static 
method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values. 
The same sequnce is followed for the next array.
Output consists of sorted symmetric difference array.
Refer sample output for formatting specifications.*/
public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			n1=Integer.parseInt(br.readLine());
			int[] a=new int[n1];
			for(int i=0;i<n1;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
			n2=Integer.parseInt(br.readLine());
			int[] b=new int[n2];
			for(int j=0;j<n2;j++)
			{
				b[j]=Integer.parseInt(br.readLine());
			}
			int[] result=UserMainCode9.getSymmetricDifference(a, b);
			for(int k=0;k<result.length;k++)
			{
				System.out.println(result[k]);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	}


