
public class VariableDemo {

	public static void main(String[] args) {
		long longValue = 5000000000l; // 8bytes
		int intValue = 5; //4bytes
		short shortValue = 2; // 2 bytes
		byte byteValue = 1; // 1 byte = 8 bits
		float f = 5.5f; // 4 bytes
		double d = 5.5;
		char c = 'A';
		c = 66; // ASCII
		
		System.out.println(c);
		
		double d1 = 5; //implicit conversion
		int k = (int)5.6; // type casting (explicit conv)
		System.out.println(k);
		
	}

}
