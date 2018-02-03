import java.util.*;


public class UserMainCode {
public static ArrayList<Integer> setopration(ArrayList<Integer> al1,ArrayList<Integer> al2, char ch)
{
	ArrayList<Integer> al3 = new ArrayList<Integer>();
	if(ch=='+')
	{
		al1.removeAll(al2);
		al1.addAll(al2);
		al3=al1;
	}
	if(ch=='*')
	{
		al1.retainAll(al2);
		al3= al1;
	}
	if(ch=='-')
	{
		al1.removeAll(al2);
		al3=al1;
	}
	return al3;
}



}
