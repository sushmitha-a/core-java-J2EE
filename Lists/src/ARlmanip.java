import java.util.*;
public class ARlmanip {
public static void main(String []args)
{
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int c = sc.nextInt();
	ArrayList al1 = new ArrayList<Integer>();
	for(int i=0;i<c;i++)
	{
		al1.add(sc.nextInt());
	}
	ArrayList al2 = new ArrayList<Integer>();
	for(int i=0;i<c;i++)
	{
		al2.add(sc.nextInt());
	}
	

	ArrayList<Integer> al5 = new ArrayList<Integer>();
	al5=ARlmanip.setopration(al1,al2,c);
	Iterator itr = al5.iterator();
	while(itr.hasNext())
	{
		int a = (int) itr.next();
		System.out.println(a);
	}

	}
public static ArrayList<Integer> setopration(ArrayList<Integer> al1,ArrayList<Integer> al2, int c)
{
	ArrayList<Integer> al3 = new ArrayList<Integer>();
	for(int i=0;i<c;i++)
	{
		if(i%2==0)
			al3.add(al2.get(i));
		else
			al3.add(al1.get(i));
	}
	return al3;
}
	}

