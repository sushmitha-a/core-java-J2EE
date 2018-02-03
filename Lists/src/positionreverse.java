import java.util.*;


public class positionreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			
			Scanner sc = new Scanner(System.in);
			ArrayList<String> al3 = new ArrayList<String>();
			int n  = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				al3.add(sc.next());
			}
		String s = sc.next();
		int  al5 =reverseArray(al3,s);
		System.out.println(al5);
		}
	}
		private static int reverseArray(ArrayList<String> al3,String s) {
			
			int t=0;
			
				
			Collections.sort(al3);
			Collections.reverse(al3);
			for(int i=0;i<al3.size();i++)
			{
			
			 if(s.equals(al3.get(i)))
			 {
			 t=i;
			 }
			 
			
		
			 }
			return t+1;
	}
		
}

		
