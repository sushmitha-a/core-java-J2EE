import java.util.Scanner;


public class ArrayFront {
public static void main(String []args)
{
	int flag=0;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		if(i<4)
		{
			if(arr[i]==9)
			{
				flag=1;
			break;
		}
		}
       
		
	}
	if(flag==1)
		System.out.println(true);
	else
		System.out.println(false);
}
}
