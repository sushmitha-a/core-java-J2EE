import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Write a program that performs the following actions:
    Read n strings as input.
    Create an arraylist to store the above n strings in this arraylist.
    Write a function convertToStringArray which accepts the arraylist as input.
    The function should sort the elements (strings) present in the arraylist and convert them 
    into a string array.
    Return the array.
Include a class UserMainCode with the static method convertToStringArray which accepts an array
list and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in
 UserMainCode.
*/
public class Main8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<String>();
	    int size;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    size=Integer.parseInt(br.readLine());
	    for(int i=0;i<size;i++)
	    {
	        arraylist.add(br.readLine());
	    }
	    String[] output=UserMainCode8.convertToStringArray(arraylist);
	    for(int i=0;i<output.length;i++)
	    {
	        System.out.println(output[i]);
	    }
		
		
		
		
		
	}

}
