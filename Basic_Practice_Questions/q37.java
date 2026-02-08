package capgemini;

public class q37 {
    public static void main(String[] args) {
        String str = "my name is nitin";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("Original string: " + str);
        System.out.println( result);
    }

}
