import java.util.Scanner;

/*Write a program to read an integer array and return the middle element in the array. The size f the array would always be odd.

Include a class UserMainCode with a static method getMiddleElement which accepts a single integer
array. The return type (integer) should be the middle element in the array.

Create a Class Main which would be used to accept Input array and call the static method present
 in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer corresponds to n, the number of elements in 
the array. The next 'n' integers correspond to the elements in the array.

Output consists of a single Integer value.

Refer sample output for formatting specifications.


 

Assume that the maximum number of elements in the array is 19.
*/
public class Main9 {
	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int a[] = new int[n];
	
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println(UserMainCode9.getMiddleElement(a));
	}
	
}
