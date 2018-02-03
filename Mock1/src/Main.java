/*Given a string input, write a program to replace every appearance of the word "is" by "is not".
If the word "is" is immediately preceeded or followed by a letter no change should be
 made to the string .
 
Include a class UserMainCode with a static method “negativeString” that accepts a 
String arguement and returns a String.
 
Create a class Main which would get a String as input and call the static method 
negativeString present in the UserMainCode.
 */


		  import java.io.*;
		class Main
		{
		   public static void main(String args[]) throws IOException
		   {
		     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
		     String s = br.readLine(); 
		    
		     System.out.println(UserMainCode.negativestring(s));
		   }
		}
