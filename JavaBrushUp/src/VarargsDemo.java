
class AddClass{
	
	public int add(int ... n) { // variable number of Argument.
		int sum=0;
		for(int k : n) {
			sum = sum+k;
		}
		return sum;
		
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
		AddClass obj = new AddClass();
		System.out.println(obj.add(1,2,3,4,555,6,7,66));
		
	}

}
