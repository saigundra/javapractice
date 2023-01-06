

class AD{
	public void show() {
		System.out.println("In A");
	}
}

class BD extends AD{
	public void show() {
		System.out.println("In B");
	}
}

class CD extends AD{
	public void show() {
		System.out.println("In C");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		//CompileTime and Runtime Polymorphism
		
		AD obj1 = new BD();  // Runtime Polymorphism
		obj1.show();
		
		obj1 = new CD();  //Dynamic method Dispatch
		obj1.show();
	}
}
