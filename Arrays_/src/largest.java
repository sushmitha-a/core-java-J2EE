import java.util.Scanner;


public class largest {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]= new int[20];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	if(arr[0]>arr[n/2]&&arr[0]>arr[n-1])
	{
		System.out.println(arr[0]);
	}
	else if(arr[n/2]>arr[0]&&arr[n/2]>arr[n-1])
	{
		System.out.println(arr[n/2]);
	}
	else
		System.out.println(arr[n-1]);
}
}
