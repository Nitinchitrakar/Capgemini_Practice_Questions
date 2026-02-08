package capgemini;
import java.util.*;
public class q31 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int original = num;
            int digits = String.valueOf(num).length();
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power = power * digit;
                }
                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }
    }

}
