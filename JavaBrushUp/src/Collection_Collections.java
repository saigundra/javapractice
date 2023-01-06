import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Collections {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404); 
		values.add(908);
		values.add(639);
		values.add(265);
		
		Collections.sort(values);
		System.out.println(values);
		Collections.reverse(values);
		System.out.println(values);
		Collections.shuffle(values);
		System.out.println(values);
	}

}
