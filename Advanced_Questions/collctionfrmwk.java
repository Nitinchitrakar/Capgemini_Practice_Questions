package nitinproject;
import java.util.*;
public class collctionfrmwk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        
        
        Stack<String> stk=new Stack<>();
        stk.push("Nitin");
        stk.push("Chitrakar");
        System.out.println(stk);
        System.out.println(stk.peek());
     }
}
