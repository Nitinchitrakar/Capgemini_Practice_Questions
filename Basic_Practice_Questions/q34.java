package capgemini;

public class q34 {
	public static void main(String[] args) {
        int[] arr = {23, 87, 45, 12, 98, 34}; 
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }

}
