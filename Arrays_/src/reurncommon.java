import java.util.Scanner;


public class reurncommon {
public static void main(String []args)
{
	int i,j,k=0,flag,sum=0;
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int arr1[]=new int[n];
	int arr2[]= new int[n];
	int arr3[]= new int[20];
	for(i=0;i<n;i++)
	{
		arr1[i]=sc.nextInt();
	}
	for(j=0;j<n;j++)
	{
		arr2[j]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		flag=0;
		for(j=0;j<n;j++)
		{
			if(arr1[i]==arr2[j])
			{
				flag=1;
			}
		}
		if(flag==1)
			sum+=arr1[i];
	}
	
		System.out.println(sum);
	
}
}
