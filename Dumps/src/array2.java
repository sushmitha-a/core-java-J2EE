/*Given a method with an int array. Write code to find the power of each individual element 
according to its position index, add them up and return as output
*/
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int i;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[20];
		for(int j=0;j<n;j++)
		{
		      a[j]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			sum=(int)(sum+Math.pow(a[i],i));
		}
		System.out.println(sum);
	}

}
