interface Abc {
	void show(); // by default Public Abstract (only declared methods.)
}

class Implementor implements Abc {

	@Override
	public void show() {
		System.out.println("anything");
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Abc obj = new Implementor();
		obj.show();
	}

}
