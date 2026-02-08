//Take 10 integers from keyboard using loop and print their average value on the screen.
package capgemini;
import java.util.Scanner;
public class q16 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int sum = 0;

	        System.out.println("Enter 10 integers:");

	        for (int i = 1; i <= 10; i++) {
	            int num = sc.nextInt();
	            sum += num;
	        }

	        double average = sum / 10.0;
	        System.out.println("Average value: " + average);
	    }
	}

