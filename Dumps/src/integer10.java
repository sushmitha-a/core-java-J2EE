
import java.util.Scanner;

public class integer10{

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();

int sum = 0;
while (n > 10) {
sum = 0;
while (n != 0) {
int r = n % 10;
sum = sum + r;
n = n / 10;
}
n = sum;
}

System.out.println(sum);

}
}
