/*
27) Given a method taking an int array as input. Write code to find the adjacent numbers 
with largest difference. Return the index of larger number.
Example:
In the sequence 4 8 6 1 9 4 the maximum distance is 8(between 1 and 9). 
The function should return the index of
 the greatest of two. In this case it is 9(which is at index 4).*/
import java.util.*;
public class arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max =0,i1=0,i2 = 0,d=0;
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		    if(a[i+1]>a[i]){
			d  = a[i+1]-a[i];
		    
			if(d>max)
		    
		    {
		    	max=d;
		    	
		       i1= i+1;
		      
		    }}
		    else{
		    	d = a[i]-a[i+1];
		    if(d>max){
		    	max=d;
		    	i1=i;
		    }
		    
		}
		}
		System.out.println(i1);
		System.out.println(max);
		
		
		
	}

}
