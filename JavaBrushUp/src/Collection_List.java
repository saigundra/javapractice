import java.util.ArrayList;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(2); // Integer v = new Integer(4) 4 is a object of Integer(wrapper class)
		values.add(6);
		values.add(9);

		for (Object o : values) {
			System.out.println(o);
		}

	}
}