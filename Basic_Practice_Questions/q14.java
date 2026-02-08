//WAP to read name (program) and print letters in ascending order (agmoprr)

package capgemini;
import java.util.*;
public class q14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.nextLine();       
        char[] chars = str.toCharArray();        
        Arrays.sort(chars);

        // Convert back to string
        String sorted = new String(chars);

        System.out.println("Sorted letters: " + sorted);
    }

}
