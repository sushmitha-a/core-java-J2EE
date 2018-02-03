/*Given a method with int array as input.
 *  Write code to find out average of maximum and minimum numbers in an array.*/
import java.util.*;
public class arraylist6 {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    int n =sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	al1.add(sc.nextInt());
    }
    Collections.sort(al1);
    int d = al1.get(0)+al1.get(n-1);
    float avg = (float)d/2;
    System.out.println(avg);
}
}
