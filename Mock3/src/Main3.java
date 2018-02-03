

		import java.util.Scanner;


		public class Main3 {
		    public static void main(String args[]){
		        Scanner sc = new Scanner(System.in);
		        String previousReading = sc.nextLine();
		        String currentReading = sc.nextLine();
		        int costPerUnit = sc.nextInt();
		        System.out.println(UserMainCode3.calculateElectricityBill(previousReading, currentReading, costPerUnit));
		    }
		}
		
		
		
		