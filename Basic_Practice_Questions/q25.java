//Merging 2 array into one array
package capgemini;

public class q25 {
	 public static void main(String[] args) {
	        int[] arr1 = {10, 20, 30};
	        int[] arr2 = {40, 50, 60, 70};

	        int n1 = arr1.length;
	        int n2 = arr2.length;

	        int[] merged = new int[n1 + n2];

	        for (int i = 0; i < n1; i++) {
	            merged[i] = arr1[i];
	        }
	        for (int i = 0; i < n2; i++) {
	            merged[n1 + i] = arr2[i];
	        }

	        System.out.println("Merged array:");
	        for (int i = 0; i < merged.length; i++) {
	            System.out.print(merged[i] + " ");
	        }
	    }

}
