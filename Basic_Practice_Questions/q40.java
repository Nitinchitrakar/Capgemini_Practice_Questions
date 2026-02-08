package capgemini;
import java.util.*;
public class q40 {
	 public static void main(String[] args) {
	        int[] arr = {-12, -45, -7, -89, -34, -2, 0, 56, 23};

	        Arrays.sort(arr);

	        int n = arr.length;
	        System.out.println("Greatest pair: " + arr[n-1] + " and " + arr[n-2]);
	    }

}
