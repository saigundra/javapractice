
public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 5; //Primitive Datatype
		
		Integer ii = new Integer(i); //Boxing - Wrapping
		
		int j = ii.intValue(); // UnBoxing - UnWrapping
		
		Integer value = i; // AutoBoxing
		
		int k = value.intValue(); // Auto Unboxing
		
		String str = "123";
		
		int n = Integer.parseInt(str);
		
		System.out.println(n);
	}
}
