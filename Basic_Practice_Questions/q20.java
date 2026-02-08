//Java Program to Find the Largest and Smallest Numbers From an Array of Random Numbers
package capgemini;
import java.util.*;
public class q20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("smallest: " + arr[0]);
        System.out.println("largest: " + arr[n - 1]);
    }
}


