//Check Two String which are reverse of each other or not
package capgemini;
import java.util.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1);
        System.out.println(s2);
        StringBuilder sb = new StringBuilder(s1);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        if(rev.equals(s2)) {
        	 System.out.println("reverse ");
        }else {
        	 System.out.println("not reverse");
        }
		
	}

}
