//Find the Smallest Sum of consecutive Number from given Array
package capgemini;
import java.util.*;
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        int sum = 0;
        int small=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(sum+arr[i]<small) {
        		
        	}
        }
        
	}

}
