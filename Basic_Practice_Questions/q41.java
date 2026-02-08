package capgemini;

public class q41 {
	public static void main(String[] args) {
        int rows = 5;  
        int sum = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" " );
            }
            System.out.println();
        }
    }

}
