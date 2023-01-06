import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Comparator {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);

//		Comparator<Integer> c = new Comparator<Integer>() {
//			public int compare(Integer i, Integer j) {
//				return i % 10 > j % 10 ? 1 : -1;
//			}
//		};

		// Sorting based on last value
		// Collections.sort(values,c);

		// using Lambda Expression
		Collections.sort(values, (i, j) -> i % 10 > j % 10 ? 1 : -1);

		for (Integer o : values) {
			System.out.println(o);
		}
	}

}
