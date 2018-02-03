/*A integer array is given as input. find the difference between each element. 
Return the index of the largest element which has the largest difference gap.*/
import java.util.*;
public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int i,max=0,in=0,d;
   int n = sc.nextInt();
   int a[]= new int[20];
   for( i=0;i<n;i++)
   {
	   a[i]=sc.nextInt();
	   
   }
   for(i=0;i<n;i++)
   {
	   if(a[i+1]>a[i])
			   {
	    d=a[i+1]-a[i];
			   }
	   else 
		   d=a[i]-a[i+1];
	   if(d>max)
	   {
		   max=d;
	   in=i;
	  }
   }
   System.out.println(max);
   System.out.println(in);
   
   
	}

}
