import java.util.ArrayList;
import java.util.List;

public class Collection_List_Generic {

	public static void main(String[] args) {
//		Before 1.7 the syntax is like below
//		List<Integer> values = new ArrayList<Integer>(); 
		
//		From 1.7 the syntax is as follows:
		List<Integer> values = new ArrayList<>();
		values.add(2); // Integer v = new Integer(4) 4 is a object of Integer(wrapper class)
		values.add(6);
		values.add(9);

		for (Integer o : values) {
			System.out.println(o);
		}

	}

}
