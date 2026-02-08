//How to remove characters from the first String which are present in the second String?
package capgemini;

public class q11 {
	
	    public static void main(String[] args) {
	        String str1 = "programming";
	        String str2 = "aeiou";   // characters to remove
	        String result = "";

	        for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);
	            int found=0;

	            
	            for (int j = 0; j < str2.length(); j++) {
	                if (ch == str2.charAt(j)) {
	                    found = found+1;
	                    break;
	                }
	            }

	            
	            if (found==0) {
	                result += ch;
	            }
	        }

	        System.out.println("Original String: " + str1);
	        System.out.println("Characters to remove: " + str2);
	        System.out.println("Result: " + result);
	    }
	
}
