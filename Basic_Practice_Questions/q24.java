//Printing Odd and Even no. from the array
package capgemini;
import java.util.*;
public class q24 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Odd and Even numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even");
            } else {
                System.out.println(arr[i] + " is Odd");
            }
        }
    }

}
