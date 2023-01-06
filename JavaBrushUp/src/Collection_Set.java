import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();

		System.out.println(values.add(67));
		System.out.println(values.add(47));
		System.out.println(values.add(17));
		System.out.println(values.add(67));

		for (Integer o : values) {
			System.out.println("hashSet: " + o);
		}

		// If we want to get in order use treeset

		Set<Integer> orderValues = new TreeSet();

		System.out.println(orderValues.add(67));
		System.out.println(orderValues.add(47));
		System.out.println(orderValues.add(17));
		System.out.println(orderValues.add(97));

		for (Integer o : orderValues) {
			System.out.println("TreeSet: " + o);
		}
	}

}
