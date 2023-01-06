//Abstract class -> Define and Declare
//Interface ->Declare -> up to 1.7
//1.8 can define methods in Interface


interface Demo{
	void abc();
	default void show() {
		System.out.println("In show");
	}
}

class DemoImpl implements DemoMulti{

	@Override
	public void abc() {
		System.out.println("In ABC Impl");
	}
	
}
public class DefaultMethodInterface {

	public static void main(String[] args) {
		DemoMulti obj = new DemoImpl();
		obj.show();
		obj.abc();
		
	}

}
