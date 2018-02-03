import java.util.ArrayList;


public class UserMainCode9 {

	public static int[] getSymmetricDifference(int[] a,int[] b) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			a1.add(a[i]);
		}
		for(int j=0;j<a.length;j++)
		{
			a2.add(a[j]);
		}
         a3.addAll(a1);
	     a4.addAll(a2);
		a1.removeAll(a2);
		a1.addAll(a2);
	    a3.retainAll(a4);
		a1.removeAll(a3);
		
		int k[]=new int[a1.size()];
		for(int h=0;h<k.length;h++)
		{
			k[h]=a1.get(h);
		}
		
		
		
		
		
		
		
		return k;
		
	}

	

}
