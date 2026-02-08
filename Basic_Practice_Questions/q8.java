//Count the no of vowels and constants in a string
package capgemini;
import java.util.*;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int v =0;
		int c = 0;
		String low=str.toLowerCase();
		for(int i = 0;i<low.length();i++) {
			char ch = low.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v=v+1;
				}
				else {
					c=c+1;
				}
			}
		}
		System.out.println("vowels : "+v);
		System.out.println("consonants : "+c);
		
	}
}


