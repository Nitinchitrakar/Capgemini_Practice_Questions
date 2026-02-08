package nitinproject;

public class first {
    public static void main(String[] args) {
        int n = 10;   
        int term = 1; 
        System.out.print(term + " "); 

        for (int i = 2; i <= n; i++) {
            int add = (i - 1) * (i - 1);
            if (term < 0) {
                term = -term; 
            }
            term = term + add;
            if (i % 2 == 0) {
                term = -term;
            }
            System.out.print(term + " ");
        }
    }
}