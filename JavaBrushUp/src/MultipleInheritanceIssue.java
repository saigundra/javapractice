interface DemoMulti{
	void abc();
	default void show() {
		System.out.println("In demo show");
	}
}

interface MyDemo{
	default void show() {
		System.out.println("In My demo show");
	}
}

class DemoImp implements Demo, MyDemo{

	@Override
	public void abc() {
			System.out.println("In abc");
	}
	
	//By using super we can eliminate ambiguity among two Show methods.
	public void show() {
		Demo.super.show();
		MyDemo.super.show();
	}
	
}

public class MultipleInheritanceIssue {

	public static void main(String[] args) {
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
	}

}
