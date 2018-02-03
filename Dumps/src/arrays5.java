import java.util.Scanner;

/*Input a int array. Square the elements in even position and
 *  cube the elements in odd position and add them as result.*/
public class arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sume=0,sumo=0,i;
Scanner sc= new Scanner(System.in);
int a[]= new int[20];
int n = sc.nextInt();
for(i=1;i<=n;i++)
{
	a[i]=sc.nextInt();
}
for(i=1;i<=n;i++)
{
	if(i%2==0)
	sume= sume+(a[i]*a[i]);
	else
	sumo= sumo+(a[i]*a[i]*a[i]);
	}

System.out.println(sume+sumo);
	}




	}


