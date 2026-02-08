package capgemini;

public class q36 {
	public static void main(String[] args) {
        String str = "HelloWorld";  
        int count = 0;

        char[] chars = str.toCharArray();
        for (char c : chars) {
            count++;
        }

        System.out.println("Length of string: " + count);
    }

}
