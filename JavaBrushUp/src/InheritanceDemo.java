
//IS-A , HAS-A RelationShip

class SimpleCalc{  //Super
	
	public int add(int a, int b) {
		return a+b;
	}
}

class Simple2Calc extends SimpleCalc{ //Sub
	
	public int sub(int a, int b) {
		return a-b;
	}
}

class AdvancedCalc extends Simple2Calc{
	
	public int mul(int a, int b) {
		return a*b;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		AdvancedCalc obj = new AdvancedCalc();
		int res1 = obj.add(1, 2);
		int res2 = obj.sub(5, 2);
		int res3 = obj.mul(2, 5);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
