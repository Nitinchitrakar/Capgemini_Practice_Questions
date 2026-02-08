/*Determine and print the number of times the character ‘a’ appears in the input entered by the
user.*/
package capgemini;
import java.util.Scanner;
public class q18 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String input = sc.nextLine();

	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == 'a') {
	                count++;
	            }
	        }

	        System.out.println("Number of 'a' characters: " + count);
	}
}
