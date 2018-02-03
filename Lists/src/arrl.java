import java.util.*;


public class arrl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ArrayList al1 = new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
	al1.add(sc.nextInt());
}
ArrayList al2 = new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
	al2.add(sc.nextInt());
}
char c = sc.next().charAt(0);

ArrayList<Integer> al5 = new ArrayList<Integer>();
al5=UserMainCode.setopration(al1,al2,c);
Iterator itr = al5.iterator();
while(itr.hasNext())
{
	int a = (int) itr.next();
	System.out.println(a);
}

}
}
