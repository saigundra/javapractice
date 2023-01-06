class AS {
	public void show() {

	}
}

class BS {
	public void show() { //show method override in BS class.we can use @Override annotation also.
		System.out.println("Show method overide");
	}
}

public class MethodOverrideDemo {

	public static void main(String[] args) {
		BS obj = new BS();
		obj.show();
	}
}
