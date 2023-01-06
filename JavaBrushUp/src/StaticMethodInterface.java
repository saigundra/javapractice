interface Static2Demo{
	int num =9; //java 8 by default it is final.
	static void show() {
		System.out.println("Hi Static");
	}
}

class Static2DemoImpl implements Static2Demo{
	//num = 0;//Cannot override final variable.
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		Static2Demo.show();
		System.out.println(Static2Demo.num);
	}

}
