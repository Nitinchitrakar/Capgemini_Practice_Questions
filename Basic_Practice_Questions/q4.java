//Find the Negetive Power without using math.pow function.
package capgemini;

public class q4 {
	    public static double power(int base, int exp) {
	        double result = 1.0;

	        if (exp > 0) {
	            for (int i = 0; i < exp; i++) {
	                result *= base;
	            }
	        }
	       
	        else if (exp < 0) {
	            for (int i = 0; i < -exp; i++) {  
	                result *= base;
	            }
	            result = 1.0 / result;  
	        }
	        
	        else {
	            result = 1.0;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        System.out.println(power(2, 5));  
	        System.out.println(power(2, -3));  
	        System.out.println(power(2, 0));   
	    }
}
