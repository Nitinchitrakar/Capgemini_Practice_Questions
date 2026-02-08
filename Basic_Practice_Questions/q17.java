/*Write a program that reads a set of integers, and then prints the sum of the even and odd
integers.*/
package capgemini;
import java.util.Scanner;
public class q17 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter how many integers: ");
	        int n = sc.nextInt();

	        int sumEven = 0;
	        int sumOdd = 0;

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            int num = sc.nextInt();
	            if (num % 2 == 0) {
	                sumEven += num;
	            } else {
	                sumOdd += num;
	            }
	        }

	        System.out.println("Sum of even integers: " + sumEven);
	        System.out.println("Sum of odd integers: " + sumOdd);
	 }

}
