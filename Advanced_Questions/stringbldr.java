package nitinproject;

public class stringbldr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Nitin";
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        System.out.println(s);
        System.out.print(rev);
	}

}
