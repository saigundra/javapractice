/*
 * 
 * Inner class have 3 basic types
 * 1.Member class (Non static class)
 * 2.Static class
 * 3.Anonymous class
 * 
 */

class Outer {  //Outer.class

	public void show() {
		System.out.println("Outer Display");
	}

	static class Inner { //Outer$Inner.class (C:\Users\SAI\eclipse-workspace\HelloWorld\bin)

		public void display() {
			System.out.println("Inner Display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		Outer outerObj = new Outer();
		outerObj.show();

		//Outer.Inner innerObj = outerObj.new Inner(); // object creating for non-static inner class
		Outer.Inner innerStaticObj = new Outer.Inner(); // object creating for static inner class.
		//innerObj.display();
		innerStaticObj.display();
	}

}
