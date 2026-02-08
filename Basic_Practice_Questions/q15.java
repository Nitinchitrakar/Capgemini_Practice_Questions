//WAP to read a number (28156437) and it should print digits order wise(12345678)
package capgemini;
import java.util.Arrays;
import java.util.Scanner;
public class q15 {

	public class SortDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        String numStr = String.valueOf(num);
	        char[] digits = numStr.toCharArray();
	        Arrays.sort(digits);
	        String sorted = new String(digits);
	        System.out.println("Digits in ascending order: " + sorted);
	    }
	}
}
