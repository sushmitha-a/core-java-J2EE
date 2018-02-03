import java.util.Scanner;

/*Given a method with an int array as input. Write code to remove all 10s from the array,
Shift the other element towards the left and fill the trailing empty positions by 0 so that the 
modified array is of the same length of the given array.*/

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		int a[] = new int[n];
   
    
   
	for(int i=0;i<n;i++)
	{
		a[i]= sc.nextInt();
	}
	getv(a,n);
		
	}
		
	
	public static void getv(int a[],int n)
	{
		 int b[]= new int[n];
		 int k=0,i;
		 for( i=0;i<n;i++)
		 {
			 if(a[i]!=10)
			 {
				 b[k]=a[i];
				 k++;
			 }
			 
		 }
		 
/* for(i=k;i<a.length;i++)
		 {
			 b[i]=0;
		 }
		 */
		 for(int j=0;j<n;j++)
		 {
			 System.out.println(b[j]);
		 }
		 
	}

		 
		 
		 
		 
		 
		 
		 
		 
	}


