
class Printer{
	public void show(Number i) {  //Number is a abstract class and it extended Integer, float.... So we can use Number class 
		System.out.println(i);
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.show(5.5);
		obj.show(5);
	}

}
