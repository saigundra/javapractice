
interface Lambda{
	void show();
}
public class LambdaDemo {

	public static void main(String[] args) {
			Lambda obj = () -> System.out.println("Im the best.");
			obj.show();
	}

}
