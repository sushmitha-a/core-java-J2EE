import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Write a program that reads details about number of admissions per year of a particular college,
return the year which had maximum admissions. The details are stored in an arraylist with the
		first index being year and next being admissions count.

Include a class UserMainCode with a static method getYear which accepts a arraylist. 
The return type is an integer indicating the year of max admissions.

Create a Class Main which would be used to accept Input string and call the static method 
present in UserMainCode.

Input and Output Format:

Input consists of 2n+1 values. The first value corresponds to size of the data (year & 
		admissions). The next n pair of numbers contains the year and admissions count.

Output consists of an integer as mentioned in the problem statement.
*/
public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> inpList = new ArrayList<Integer>();
		for(int i=0;i<n*2;i++) {
			inpList.add(Integer.parseInt(br.readLine()));
		}
		System.out.println(UserMainCode4.getYear(inpList));	
	}

}












