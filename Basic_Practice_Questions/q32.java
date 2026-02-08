package capgemini;
import java.util.*;
public class q32 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1; // for 0
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }

}
