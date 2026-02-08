package capgemini;
import java.util.*;
public class q45 {
	public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);

        System.out.println("Shuffled array: " + list);
    }

}
