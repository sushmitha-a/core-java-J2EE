import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class sortandmerge {
	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
	

	ArrayList al1 = new ArrayList<Integer>();
	for(int i=0;i<5;i++)
	{
		al1.add(sc.nextInt());
	}
	ArrayList al2 = new ArrayList<Integer>();
	for(int i=0;i<5;i++)
	{
		al2.add(sc.nextInt());
	}
	

	ArrayList<Integer> al5 = new ArrayList<Integer>();
	al5=sortandmerge.setopration(al1,al2);
	Iterator itr = al5.iterator();
	while(itr.hasNext())
	{
		int a = (int) itr.next();
		System.out.println(a);
	}

}
public static ArrayList<Integer> setopration(ArrayList<Integer> al1,ArrayList<Integer> al2)
{
	al1.addAll(al2);
	Collections.sort(al1);
	ArrayList<Integer> al3 = new ArrayList<Integer>();
	al3.add(al1.get(2));
	al3.add(al1.get(6));
	al3.add(al1.get(8));
	return al3;
}
}
