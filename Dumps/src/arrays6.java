import java.util.Arrays;
import java.util.Scanner;


/*find the average of the maximum and minimum number in an integer array*/

public class arrays6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
Arrays.sort(a);

System.out.println(a[0]);
System.out.println(a[n-1]);
float c = (float) (a[0]+a[n-1])/2;
System.out.println(c);



	}

}
