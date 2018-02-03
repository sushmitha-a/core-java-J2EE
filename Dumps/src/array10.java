import java.util.*;
public class array10 {

	public static void main(String[] args) {
	int i;	// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
for( i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	
}
for(i=0;i<n;i++)
{
	b[i]= sc.nextInt();
}
for(i=0;i<n;i++)
{
	if(i%2==0)
		c[i]=b[i];
	else
		c[i]=a[i];

}
for(i=0;i<n;i++)
{
	System.out.println(c[i]);
}

	}

}
