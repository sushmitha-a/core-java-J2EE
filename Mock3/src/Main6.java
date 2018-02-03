

  import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = null;        
        input=sc.nextLine();
        int result=UserMainCode6.validatestrings(input);
        if(result==1)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    
}

