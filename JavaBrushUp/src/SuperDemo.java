class A{
	int i;
	public A() {
		System.out.println("In A");
	}
	
	public A(int i) {
		System.out.println("In A int");
	}
	
	public void show() {
		System.out.println("Show");
	}
}

class B extends A{
	int i = 8;
	
	public B() {
		super.i = 9; // we can assign super class variables by using super keyword in child class.
		super.show();// we can call super class methods by using super keyword in child class.
		System.out.println("In B");
	}
	
	public B(int i) {
		super(i);
		System.out.println("In B int");
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		B obj = new B();
	}
}
