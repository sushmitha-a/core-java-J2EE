import java.util.Scanner;

/*age of Primes

Write a program to read an array and find average of all elements located at index i, where i is

 a prime number. Type cast the average to an int and return as output. The index starts from 0.

Include a class UserMainCode with a static method addPrimeIndex which accepts a single integer 
array. The return type (integer) should be the average of all elements located at index i where 
i is a prime number.

Create a Class Main which would be used to accept Input array and call the static method present
 in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer corresponds to n, the number of elements
 in the array. The next 'n' integers correspond to the elements in the array.

Output consists of a single Integer.

Refer sample output for formatting specifications.*/

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(UserMainCode6.addPrimeIndex(a));
				
	}

}
