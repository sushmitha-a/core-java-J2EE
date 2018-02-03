import java.util.Scanner;


public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        sc.nextLine();
	        String array[] = new String[size];
	        for(int i=0;i<size;i++){
	            array[i] = sc.nextLine();
	        }
	        String str = sc.nextLine();
	        System.out.println(UserMainCode5.getElementPosition(array, str));
		
		
		
		
		
		
		
		
	}

}
