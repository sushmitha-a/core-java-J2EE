import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class getmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				Scanner sc = new Scanner(System.in);
				int n  = sc.nextInt();
				HashMap<Integer,String> hm= new HashMap<Integer,String>();
				for(int i=0;i<n;i++)
				{
					hm.put(sc.nextInt(),sc.next());
				}
				
			
				String op=max(hm);
				System.out.println(op);
				
			}

			private static String max(HashMap<Integer, String> hm)
					 {
				// TODO Auto-generated method stub
				
			   int k = Collections.max(hm.keySet());
			     String v = hm.get(k);
			   
			     return v;
			}
			}


