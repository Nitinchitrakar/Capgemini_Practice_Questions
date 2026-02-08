package capgemini;

public class q49 {
	public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "Hello";

        if (str1.startsWith(str2)) {
            System.out.println(str1 + " starts with "+ str2 );
        } else {
            System.out.println(str1 + " not starts with "+ str2);
        }
    }

}
