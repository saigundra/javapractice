//Static Variables are same for all objects
//Non-static variables are different for all objects
//Cannot use non-static variables in static block
class Employee{
	int eid;
	int salary;
	static String ceo;
	
	//Static variables are initialized when you load a class
	static {
		ceo = "Sai_Vardhan";
		System.out.println("In static");
	}
	
	//Non-static variables are initialized when you create an object.
	public Employee() {
		eid = 1;
		salary = 40000;
		System.out.println("In constructor");
	}
	public void show() {
		System.out.println(eid+" "+salary+" "+ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		Employee sai = new Employee();
		Employee vardhan = new Employee();
		Employee.ceo = "Larry";  // For calling static variables no need to create objects, we can directly call with class name.
		sai.show();
		vardhan.show();
	}

}
