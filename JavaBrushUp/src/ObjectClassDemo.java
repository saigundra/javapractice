
class Calc {

//	Knows something
	int num1;
	int num2;
	int result;

	// Parameterized constructor with different local(k,m) and instance(num1, num2)
	// variable names
	public Calc(int k, int m) {
		num1 = k;
		num2 = m;
	}

	// Default constructor
	public Calc() {

	}

	// Parameterized constructor with same local(num1,num2) and instance(num1, num2)
	// variable names then we will use this keyword.
	
	/*
	 * public Calc(int num1, int num2) {
	 *  this.num1 = num1; 
	 *  this.num2 = num2;
	 }*/

	// Does something (behavior)
	void perform() {
		result = num1 + num2;
	}
}

public class ObjectClassDemo {

	public static void main(String[] args) {

		Calc object = new Calc(); // Object knows something and does something (default constructor)
		object.perform();
		System.out.println(object.num1 + " " + object.num2 + " " + object.result); // default values printed

		Calc object1 = new Calc(2, 3);
		object1.perform();
		System.out.println(object1.num1 + " " + object1.num2 + " " + object1.result);

	}
}
