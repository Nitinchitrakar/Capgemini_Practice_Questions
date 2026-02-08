//Find the Power without using math.pow function.
package capgemini;
import java.util.*;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Value");
        int n = sc.nextInt();
        System.out.println("Enter Exponential value");
        int expo=sc.nextInt();
        int pow=1;
        for(int i =1;i<=expo;i++) {
        	pow = pow*n;
        }
        System.out.println(pow);
        
	}

}
