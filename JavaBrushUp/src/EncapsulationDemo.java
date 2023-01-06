

//Encapsulation is binding data with methods.

class Student{
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Demo");
		s.setRollNo(1);
		System.out.println(s.getName()+" "+s.getRollNo());
	}

}
