// Printing only not-repeated digits in the array.
package capgemini;
import java.util.*;
public class q21 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " digits:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Non-repeated digits: ");
        for (int i = 0; i < n; i++) {
            int repeated = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeated = 1; 
                    break;
                }
            }
            if (repeated == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
