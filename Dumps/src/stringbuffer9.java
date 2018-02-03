import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class Test{
  public static void main(String args[]){
   Integer arr[]={3,4,3,2};
   Set<Integer> s=new TreeSet<Integer>(Arrays.asList(arr));
   s.add(1);
   for(Integer ele :s){
    System.out.println(ele);   }  }}