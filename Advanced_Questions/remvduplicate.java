package nitinproject;
import java.util.*;
public class remvduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
	}
	

}
