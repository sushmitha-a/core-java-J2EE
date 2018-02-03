import java.util.*;

/*51) Input1=845.69, output=3:2;
Input1=20.789; output=2:3;
Input1=20.0; output=2:1;
output is in Hashmap format.
Hint: count the no of digits.*/
public class hashmap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		StringTokenizer st = new StringTokenizer(s,".");
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		while(st.hasMoreTokens())
		{
			String s2= st.nextToken();
			int l= s2.length();
		    String s3 = st.nextToken();
		    int l1 = s3.length();
			hm.put(l, l1);
		}
		
		System.out.println(hm);
	}

}
