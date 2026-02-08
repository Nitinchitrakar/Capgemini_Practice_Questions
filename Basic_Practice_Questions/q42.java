package capgemini;

public class q42 {
	public static void main(String[] args) {
        String str = "editeded";  

        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);

            if (firstTwo.equals(lastTwo)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("String is smalll.");
        }
    }

}
