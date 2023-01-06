import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection_Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("myname", "John");
		map.put("actor", "Akshy");
		map.put("CEO", "Larry");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + " " +map.get(key));
		}
				
	}

}
