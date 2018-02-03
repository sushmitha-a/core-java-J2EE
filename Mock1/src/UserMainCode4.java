import java.util.ArrayList;
import java.util.*;



public class UserMainCode4 {

	public static int getYear(ArrayList<Integer> inpList) {
		// TODO Auto-generated method stub
		int max=0,n=0;
		for(int i=1;i<inpList.size();i=i+2)
		{
			int v  =inpList.get(i);
			if(v>max)
			{
				max=v;
			n=inpList.get(i-1);
			}
			
		}
		return n;
	}

}
