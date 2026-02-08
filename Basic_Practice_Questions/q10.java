//Write a program to find the difference between equals and ==
package capgemini;

public class q10 {
	
	    public static void main(String[] args) {
	        String s1 = new String("Nitin");
	        String s2 = new String("Nitin");

	        System.out.println("Using == : " + (s1 == s2));
	        System.out.println("Using equals(): " + s1.equals(s2));

	        String s3 = "Hello";
	        String s4 = "Hello";

	        System.out.println("Using == : " + (s3 == s4));
	        System.out.println("Using equals(): " + s3.equals(s4));

	        int a = 10;
	        int b = 10;

	        System.out.println("Using == with primitives: " + (a == b));
	    }
	
}
