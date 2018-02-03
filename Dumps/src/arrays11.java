//String array will be given.
//if a string is Prefix of an any other string in that array means count.
import java.util.*;
public class arrays11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
        String s1[]= new String[n];
        for(int i=0;i<n;i++)
        {
        	s1[i]=sc.next();
        }
      for(int i=0;i<n-1;i++)
      {
    	  for(int j=i+i;j<n;j++)
    	  {
    		  if(s1[i].startsWith(s1[j])||s1[j].startsWith(s1[i]))
    			  count++;
    	  }
      }
      
      System.out.println(count);
        
		
		
		
		
	}

}
